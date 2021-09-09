package WaitNotify;

public class RunnablePojo   implements Runnable{
	  Object mutex=new Object();   
	  
	    public RunnablePojo() {
	        mutex=1;
	    
	    }

	public void run()   {
		System.out.println(Thread.currentThread().getName()
              + ", executing run() method!");
		try {
			switch(Thread.currentThread().getName()) {
			case "Thread-0":
				first();break;
			case "Thread-1":
				second();break;
			case "Thread-2": third();break;
			}
		}catch(Exception e) {
			System.out.println("eee");
		}
	
		
	}

  public void first() throws InterruptedException {
	synchronized(mutex) {
		System.out.println("print first");
		mutex.notifyAll();
	    mutex=(int)mutex+1;
	}
      
  }

  public void second() throws InterruptedException {
	  synchronized(mutex) {
      while((int)mutex!=2) {
    	  mutex.wait();
      }
   
      System.out.println("print second");
      mutex.notifyAll();
      mutex=(int)mutex+1;
	  }
  }

  public void third() throws InterruptedException {
	  
	  synchronized(mutex) {
	      while((int)mutex!=3) {
	    	  mutex.wait();
	      }
	   
	      System.out.println("print third");
	      mutex.notifyAll();
	      mutex=(int)mutex+1;
		  }

  }

}
