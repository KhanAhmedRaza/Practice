package com.java.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		boolean isValidInput = false;
		while(!isValidInput){
			System.out.println("Please enter a valid number");
			Scanner scan = new Scanner(System.in);
			try{
				int number = scan.nextInt();
				isValidInput = true;
				System.out.println("Are input and reversed number same"+
				":"+((checkReverse(number))?"Yes":"No"));
			}catch(Exception e){
				System.out.println("you have not entered a valid number");
			}
		}
		

	}
	
	public static boolean checkReverse(int num){
		boolean isReverseSame = false;
		int n = num;
		int reverse = 0;
		while(num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
		    num = num / 10;
		}
		if(n == reverse){
			return !isReverseSame;
		}
		return isReverseSame;
		
	}

}
