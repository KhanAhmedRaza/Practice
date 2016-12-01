package com.java.practice;

import com.java.practice.i.MathOperation;

public class LambdaExample1 {

	public static void main(String[] args) {
		LambdaExample1 example1 = new LambdaExample1();
		MathOperation addition = (int a, int b) -> a +b;
		
		System.out.println("5 + 4 = "+  example1.operate(5, 4, addition));

	}
	
	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}

}
