package com.day.six;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int result = 0;
		System.out.println("Enter the Number :");
		Scanner num = new Scanner(System.in);
		int n =  num.nextInt();

		int i = 1;
		while(i <= n/2) {
			if (n % i == 0) {
				result = result + i;
			}i++;
		}

		if (result == n) {
			System.out.println(n+ " is a Perfect number");
		}
		else 
			System.out.println(n+ " is not a Perfect number");
		
	}
}

