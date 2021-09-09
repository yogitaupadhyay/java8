package WaitNotify;

import Thread.RunnablePojo;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RunnablePojo obj=new RunnablePojo();
		
		Thread th1=new java.lang.Thread(obj);
		th1.start();

		Thread th2=new java.lang.Thread(obj);
		th2.start();
		

		Thread th3=new java.lang.Thread(obj);
		th3.start();
	}

}
