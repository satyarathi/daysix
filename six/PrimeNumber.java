package com.day.six;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int num = sc.nextInt();
		int i = 0;
		int y = 0;

		for(i = 2;i < num;i++) {
			if(num%i==0) 
			{
				y++;
				break;
			}
		}
		if (y > 0)
		{System.out.println(num+ " is not a prime number");

		}else {
			System.out.println(num+ " is a prime number");
		}

	}
}
