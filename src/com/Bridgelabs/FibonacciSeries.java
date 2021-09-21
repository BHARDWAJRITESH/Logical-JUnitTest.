package com.Bridgelabs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number1=0, number2=1,number3;
		int count=10;
		
		System.out.println(number1+" "+number2);
		
		for (int i =2; i<count;++i) {
			number3 = number1 + number2;
			System.out.println(" " + number3);
			
			number1=number2;
			number2=number3;
		}
		
	}

}
