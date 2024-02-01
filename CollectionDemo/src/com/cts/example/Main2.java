package com.cts.example;

interface BasicArithmeticOperation {
	public int add(int a, int b);
	public int sub(int a, int b);
}

//class ArithmeticOperationClient implements BasicArithmeticOperation {
//
//	@Override
//	public int add(int a, int b) {
//		return a + b;
//	}
//
//	@Override
//	public int sub(int a, int b) {
//		return a - b;
//	}
//}

public class Main2 {
	public static void main(String[] args) {

		BasicArithmeticOperation operation = new BasicArithmeticOperation() {
			@Override
			public int sub(int a, int b) {
				return a - b;
			}
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println(operation.add(5, 5));
		System.out.println(operation.sub(5, 5));

	}

}
