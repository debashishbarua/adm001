package com.cts.example;

import java.util.function.BiFunction;



public class LambdaDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> ref= (a,b) -> a*b;
		System.out.println(ref.apply(10, 30));
		
		
	}

	
}


