package com.day.six;

public class CouponNumber {
	public static void main(String[] args) 
	{
		char[] code = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9'};
		int num = 1000000;
		int random = (int) (Math.random()*num);	
		String n = "";
		
		
		while (random>0)
		{
			n = n+(code[random % code.length]);
			random = random / code.length;
			
		}

		String couponCode=n.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}
	
	}


