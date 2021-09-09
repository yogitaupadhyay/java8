package Thread.ProducerConsumer;

import java.util.Queue;

///Note consumer and producer use same queue i.e. shared resource that is why we need concurrency handling
public class Producer implements Runnable{
	
	Queue<Integer>taskQueue;
	int nextProduce;
	final int  MAX_CAP=5;
	
	
	Producer(Queue<Integer>taskQueue){
		this.taskQueue=taskQueue;
	}
	
	public void run() {
		while(true) {
			try {
				produce();
			}catch(Exception e) {
				System.out.println(Thread.currentThread().getName()+" is in waiting state");
			}
			
		}
	}
	
	void produce() throws InterruptedException {
		synchronized(taskQueue) {
			if(taskQueue.size()==MAX_CAP) {
				taskQueue.wait();
			}
			Thread.sleep(1000);
			System.out.println("produced: "+(nextProduce+1));
			taskQueue.add(nextProduce++);
			taskQueue.notifyAll();
		}
		
	}
	
	

}
