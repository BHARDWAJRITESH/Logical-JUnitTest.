package com.Bridgelabs;

import java.util.Scanner;

public class SimulateStopwatchProgram {

	public static void main(String[] args) {
		
		System.out.println("Press  any key to start stopwatch");
		
		double start = System.currentTimeMillis();
		startStopwatch();
		
		double end = System.currentTimeMillis();
		System.out.println("Time: "+(end-start)+" Millisecond ");
	}
	
	static void startStopwatch() {
		Scanner scan = new Scanner(System.in);
		
		char object1 = scan.next().charAt(0);
		System.out.println("Press  any key to stop stopwatch");
		char object2 =scan.next().charAt(0);
		
	}
		

	

}
