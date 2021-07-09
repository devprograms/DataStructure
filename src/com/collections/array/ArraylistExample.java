package com.collections.array;

import java.util.ArrayList;

public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList<String> car =new ArrayList<>();
		car.add("BMW");
		car.add("volvo");
		
		
		for (String string : car) {
			System.out.println(string);
		}
		
		
	}

}
