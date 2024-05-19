package com.exceptionHandling;

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("Start");				
		
		int a = 30;
		int b = 0;
		int result=1;
		
		try {
		result = a/b;
		}catch (ArithmeticException ae){
			System.out.println(ae.toString());
		// 	throw ae;
		}catch (Exception ae1){
			System.out.println(ae1.toString());
		// 	throw ae;
		}finally {
			System.out.println("finally block");
		}
		
		System.out.println("result: "+result);
		System.out.println("end");
	}

}
