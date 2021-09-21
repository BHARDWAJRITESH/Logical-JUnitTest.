package com.Bridgelabs;

public class CouponNumber {

	public static void main(String[] args) {
		char[] character = "abcdefghijklmnopqrstuvwxyzKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		int maximum = 100000000;
		int random =(int) (Math.random() *  maximum);
		StringBuilder stringBuilder = new StringBuilder();
		
		while (random > 0) {
			stringBuilder.append(character[random % character.length]);
			random /= character.length;	
		}
		
		String couponCode = stringBuilder.toString();
		System.out.println("Coupon Code: " + couponCode);

	}

}
 