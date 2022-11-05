package com.day.six;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter First Number :");
		Scanner num1 = new Scanner(System.in);
		int first = num1.nextInt();
		
		System.out.println("Enter Second Number :");
		Scanner num2 = new Scanner(System.in);
		int second = num2.nextInt();
		
		System.out.println("Enter nth Number :");
		Scanner count = new Scanner(System.in);
		int n = count.nextInt();
		
		System.out.println(first+" "+second);
		
		for(int i=2; i<n; i++) {
			int third = first + second;
			first = second;
			second = third;
			System.out.println(third);
		}
	}
}
