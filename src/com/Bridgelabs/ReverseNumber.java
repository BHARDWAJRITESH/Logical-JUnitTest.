package com.Bridgelabs;

import java.util.Scanner;

public class ReverseNumber {
		public static void main(String[] args) {
			
			int number; 
			int reminder; 
			int reverseNumber = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" Please Enter any Number you want to Reverse : ");
			number = sc.nextInt();

			while (number > 0) {
				reminder = number % 10;
				reverseNumber = reverseNumber * 10 + reminder;
				number = number / 10;
			}
			System.out.format(" Reverse of entered number is = %d\n", reverseNumber);
		}
}