// Copyright (c) 1998 Thomas E. Davis

package org.transinfo.messaging.communication.posdailer;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool
{
    private long expirationTime;
    private long lastCheckOut;

    private Hashtable locked;
    private Hashtable unlocked;

    private CleanUpThread cleaner;

    ObjectPool()
    {
        expirationTime = ( 1000 * 30 ); // 30 seconds

        locked = new Hashtable();
        unlocked = new Hashtable();

        lastCheckOut = System.currentTimeMillis();

        //cleaner = new CleanUpThread( this, expirationTime );
        //cleaner.start();
    }

    abstract Object create() throws Exception;

    abstract boolean validate( Object o );

    abstract void expire( Object o );

public void poolSize()
{
	 if(unlocked!=null)
	 {
		 System.out.println("UNLOCKED POOL SIZE="+unlocked.size());
 	 }
 	 if(locked != null)
 	 {
		 System.out.println("LOCKED POOL SIZE="+locked.size());
  	 }

}
    public synchronized Object checkOut() throws Exception
    {
        long now = System.currentTimeMillis();
        lastCheckOut = now;
        Object o =null;
		System.out.println("%%%%%%%% SIZE="+unlocked.size());
        if( unlocked.size() > 0 )
        {
            Enumeration e = unlocked.keys();

            while( e.hasMoreElements() )
            {
                o = e.nextElement();

                if( validate( o ) )
                {
                    unlocked.remove( o );
                    locked.put( o, new Long( now ) );
                    return( o );
                }
                else
                {
                    unlocked.remove( o );
                    expire( o );
                    o = null;
                }
            }
        }



        System.out.println("checkout end");
        return (o);

    }

   public void checkIn( Object o )
    {
		System.out.println("checkIn Close");
        if( o != null )
        {
			System.out.println("******* Object Received");
            locked.remove( o );
            unlocked.put( o, new Long( System.currentTimeMillis() ) );
        }
        else
        {
			System.out.println("******* Object received in checkIn is null");
		}

		System.out.println("****** SIZE="+unlocked.size()+"  "+locked.size());
    }

    synchronized void cleanUp()
    {
        Object o;

        long now = System.currentTimeMillis();

        Enumeration e = unlocked.keys();

        while( e.hasMoreElements() )
        {
            o = e.nextElement();

            if( ( now - ( ( Long ) unlocked.get( o ) ).longValue() ) > expirationTime )
            {
                unlocked.remove( o );
                expire( o );
                o = null;
            }
        }

        System.gc();
    }
}

class CleanUpThread extends Thread
{
    private ObjectPool pool;
    private long sleepTime;

    CleanUpThread( ObjectPool pool, long sleepTime )
    {
        this.pool = pool;
        this.sleepTime = sleepTime;
    }

    public void run()
    {
        while( true )
        {
            try
            {
                sleep( sleepTime );
            }
            catch( InterruptedException e )
            {
                // ignore it
            }
            pool.cleanUp();
        }
    }
}
