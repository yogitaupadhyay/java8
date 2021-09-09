package Thread.ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable {
	Queue<Integer>taskQueue;
	int nextConsume;
	
	Consumer(Queue<Integer>taskQueue){
		this.taskQueue=taskQueue;
	}
	
	
	public void run() {
		while(true) {
			try {
				consume();
			}catch(Exception e) {
				System.out.println(Thread.currentThread().getName()+" is in waiting state");
			}
			
		}
	}
	
	
	void consume() throws InterruptedException {
		synchronized(taskQueue) {
			if(taskQueue.size()==0) {
				taskQueue.wait();
			}
			Thread.sleep(1000);
			System.out.println("consumed: "+taskQueue.poll());
			taskQueue.notifyAll();
		}
		
	}
	
	
}
