package lab5;

import java.util.*;
import java.text.*;

public class MCCAirport0 {
	
	public static final double LANDING_TIME = 3;
	public static final double TAKE_OFF_TIME = 2;
	public static final double LANDING_RATE = 10;
	public static final double TAKE_OFF_RATE = 10;
	public static final int ITERATIONS = 1440;
	
	
	public static boolean randomGenerator(double number) {
		
	Random generator = new Random(System.currentTimeMillis());
	
		if(Math.random() < (number / 60)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean planeFailure(int element, int i, int maxTime) {
		if(i - element > maxTime) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int landingQueueTime = 0;
		int takeOffQueueTime = 0;
		int landedPlanes = 0;
		int takeOffPlanes = 0;
		int maxTime = 10;
		
		ArrayQueue<Integer> landingQueue = new ArrayQueue<Integer>();
		ArrayQueue<Integer> takeOffQueue = new ArrayQueue<Integer>();
		
		Random generator = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < ITERATIONS; i++) {
			if(generator.nextDouble() < LANDING_RATE/60) {
				landingQueue.enqueue(i);
				//
				landingQueueTime.enqueue(i);
			}
			
			if(generator.nextDouble() < (TAKE_OFF_RATE/60)) {
				takeOffQueue.enqueue(i);
			}
			
			while(true) {
				while(!landingQueue.isEmpty() && planeFailure(landingQueue.peek(), i, maxTime)) {
					landingQueue.dequeue();
				}
				
				if(!landingQueue.isEmpty()) {
					int temp = landingQueue.peek();
					landingQueue.dequeue();
					landingQueueTime += i - temp;
					landedPlanes++;
					
					int j;
					for(j = i; j < (LANDING_TIME + i) && j < ITERATIONS; ++j) {
						if(randomGenerator(LANDING_RATE)) {
							landingQueue.enqueue(j);
						}
						
						if(randomGenerator(TAKE_OFF_RATE)) {
							landingQueue.enqueue(j);
						}
					}
					
					i = j;
				}
				
				if(i >= ITERATIONS) {
					break;
				} else {
					break;
				}
				
			}
			
			if(!takeOffQueue.isEmpty()) {
				int temp = takeOffQueue.peek();
				takeOffQueue.dequeue();
				takeOffPlanes++;
				takeOffQueueTime += i - temp;
				
				int j;
				
				for(j = i; j < TAKE_OFF_RATE + j && j < ITERATIONS; ++j) {
					if(randomGenerator(LANDING_RATE)) {
						landingQueue.enqueue(j);
					}
					if(randomGenerator(TAKE_OFF_RATE)) {
						takeOffQueue.enqueue(j);
					}
				}
				
				i = j;
			}
		}
		
		while(!landingQueue.isEmpty() && planeFailure(landingQueue.peek(), ITERATIONS, maxTime)) {
			landingQueue.dequeue();
		}
		
		NumberFormat decimal = new DecimalFormat("#0.000000");
		
		System.out.println("Average landing queue length: " + decimal.format((double)landedPlanes/ITERATIONS));
	    System.out.println("Average take off queue length: " + decimal.format((double)takeOffPlanes/ITERATIONS));
	    System.out.println("Average landing queue time: " + decimal.format(landingQueueTime / (double)landedPlanes));
	    System.out.println("Average take off queue time: " + decimal.format(takeOffQueueTime / (double)takeOffPlanes));

	}
	
	


}
