package lab5;

import java.util.*;
import java.text.*;

public class MCCAirport {
	
	public static int typecast(double dbl) {
		return (int)dbl;
	}
	
	
	
	public static void main(String[] args) {
		int maxQueueSize = 100;
		final double LANDING_TIME = 3;
		final double TAKE_OFF_TIME = 2;
		final double LANDING_RATE = 10;
		final double TAKE_OFF_RATE = 10;
		final int ITERATIONS = 1440;
		
		int waitTime = 10;
		
		Random generator = new Random(System.currentTimeMillis());
		
		ArrayQueue<Integer> Runway = new ArrayQueue<Integer>();
		ArrayQueue<Integer> PlanesLanding = new ArrayQueue<Integer>();
		ArrayQueue<Integer> PlanesTakingOff = new ArrayQueue<Integer>();
		ArrayQueue<Integer> LandingLength = new ArrayQueue<Integer>();
		ArrayQueue<Integer> TakeOffLength = new ArrayQueue<Integer>();
		ArrayQueue<Integer> ArrivalTime = new ArrayQueue<Integer>();
		ArrayQueue<Integer> DepartureTime = new ArrayQueue<Integer>();
		ArrayQueue<Integer> LandingTime = new ArrayQueue<Integer>();
		ArrayQueue<Integer> TakeOffTime = new ArrayQueue<Integer>();
		
		for(int i = 0; i < ITERATIONS; i++) {
			
			if(generator.nextDouble() < LANDING_RATE/60) {
				PlanesLanding.enqueue((int)LANDING_TIME);
				LandingTime.enqueue(i);
			}
			
			if(generator.nextDouble() < TAKE_OFF_RATE/60) {
				PlanesTakingOff.enqueue((int)TAKE_OFF_TIME);
				TakeOffTime.enqueue(i);
			}
			
			if(Runway.isEmpty()) {
				if(!PlanesLanding.isEmpty()) {
					Runway.enqueue(PlanesLanding.peek());
					PlanesLanding.dequeue();
					LandingTime.enqueue(i - ArrivalTime.peek());
					ArrivalTime.dequeue();
					waitTime = Runway.peek();
				} else {
					if(!PlanesTakingOff.isEmpty()) {
						Runway.enqueue(PlanesTakingOff.peek());
						PlanesTakingOff.dequeue();
						TakeOffTime.enqueue(i - DepartureTime.peek());
						DepartureTime.dequeue();
						waitTime = Runway.peek();
					}
				}
				
				waitTime--;
				
				if(waitTime == 0) {
					Runway.dequeue();
				}
			}
			
			LandingLength.enqueue(PlanesLanding.count());
			TakeOffLength.enqueue(PlanesTakingOff.count());
		}
		
		NumberFormat decimal = new DecimalFormat("#0.000000");
		
		System.out.println("Average Landing Queue Length: " + decimal.format(LandingLength));
		System.out.println("Average Take Off Queue Length: "+ decimal.format(TakeOffLength));
		System.out.println("Average Landing Queue Time: "+ decimal.format(LandingTime));
		System.out.println("Average Take Off Queue Time: "+ decimal.format(TakeOffTime));
		
	}

}
