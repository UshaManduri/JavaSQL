package com.innerclasses;

public class MemberOuterClass {

	private int a = 30;
	
	public class InnerClass{

		void message() {
			System.out.println("data: "+a);
		}
	}	
		public static void main(String[] args) {
			MemberOuterClass memeberOuterClass = new MemberOuterClass();
			MemberOuterClass.InnerClass innerClassObject = memeberOuterClass.new InnerClass();
			
			innerClassObject.message();

			
		}
}
