package Thread.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

import Thread.RunnablePojo;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue<Integer>q=new LinkedList<Integer>();
		
   Producer prod=new Producer(q);
   Consumer cons=new Consumer(q);
   
		Thread pr=new java.lang.Thread(prod);
		

		Thread cns=new java.lang.Thread(cons);
		cns.start();
		pr.start();
		

		
	}

}
