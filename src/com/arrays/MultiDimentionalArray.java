package com.arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		String XDArray[][] = {{"a","b","c"},{"j","k","l"},{"m","n","o"}};
		for(int i=0; i<3;i++) {
			for(int x=0;x<3;x++) {
				//we need 2 for loops as this is a multi-dimentional Array
				System.out.print(XDArray[i][x] +" ");
			}
			System.out.print("\n");
		}
	}

}
