package com.example.demo;

import java.util.Comparator;

public class TestString {

	public static void main(String[] args) {

		/*
		 * Comparator<String> comparator = new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o1.compareTo(o2);
		 * } };
		 * 
		 * int comparision =comparator.compare("hello", "hello");
		 * System.out.println(comparision);
		 * 
		 * 
		 * // Lambda
		 * 
		 * Comparator<String> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
		 * 
		 * int comparisionLambda =comparatorLambda.compare("hello", "hello");
		 * System.out.println(comparisionLambda);
		 */
		
		TestInter testInt = (String str) -> {
			System.out.println(str);
		};
		testInt.apply("Test1234");

	}

}
