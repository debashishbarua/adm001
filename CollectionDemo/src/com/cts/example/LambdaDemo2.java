package com.cts.example;

@FunctionalInterface
interface BinaryOperation {
	int operation(int a, int b);
	
}


public class LambdaDemo2 {
	public static void main(String[] args) {
		BinaryOperation addOperation = 	  ( a,  b) ->  a + b;		
		System.out.println(addOperation.operation(5, 5));

		BinaryOperation subOperation = ( a,  b) ->  a - b;	
		System.out.println(subOperation.operation(10, 5));

		mycalculation(10, 10, addOperation);
		mycalculation(100, 10, subOperation);
	}

	private static void mycalculation(int i, int j, BinaryOperation binaryOperation) {
		System.out.println(binaryOperation.operation(i, j));

	}
}


//
//public class LambdaDemo {
//	public static void main(String[] args) {
//		BinaryOperation addOperation = new BinaryOperation() {
//			@Override
//			public int operation(int a, int b) {
//				return a + b;
//			}
//		};
//		System.out.println(addOperation.operation(5, 5));
//
//		BinaryOperation subOperation = new BinaryOperation() {
//			@Override
//			public int operation(int a, int b) {
//				return a - b;
//			}
//		};
//		System.out.println(subOperation.operation(10, 5));
//
//		mycalculation(10, 10, addOperation);
//		mycalculation(100, 10, subOperation);
//	}
//
//	private static void mycalculation(int i, int j, BinaryOperation binaryOperation) {
//		System.out.println(binaryOperation.operation(i, j));
//
//	}
//}
