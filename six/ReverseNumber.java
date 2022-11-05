package com.day.six;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	System.out.println("Enter any Number :");
	Scanner n = new Scanner(System.in);
	int num = n.nextInt();
	
	int reminder = 0;
	int result=0;
	while (num > 0) {
		reminder = num % 10;
		num = num/10;
		result =( reminder + (result*10));	
	}
	System.out.println("reverse of num is:" +result);
}
}
