package com.collectionsframework;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		//push = add
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		//Removes the object at the top of this stack and returns that object as the value of this function.
		stack.pop();
		
		System.out.println(stack);
		System.out.println(stack.peek()); //Looks at the object at the top of this stack without removing it from the stack
		System.out.println(stack.search("C"));
		
	}

}
