package Thread;

public class RunnablePojo  implements Runnable{
	  int mutex=0;  
	 
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
        System.out.println("print first");
        mutex++;
    }

    public void second() throws InterruptedException {
        while(mutex!=2);
     
        System.out.println("print second");
        mutex++;
    }

    public void third() throws InterruptedException {
        while(mutex!=3);
      
        System.out.println("print third");
        mutex++;
    }

}
