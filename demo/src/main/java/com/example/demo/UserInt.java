package com.example.demo;

public class UserInt implements TestInter {

	@Override
	public void apply(String strInt) {
		System.out.println("in Class");
	}
	
	public static void check() {
		
	}
	
	public static void main(String[] args) {
		TestInter tst = null;
		tst.apply("Test");
	}

}


