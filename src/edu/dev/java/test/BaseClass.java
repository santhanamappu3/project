package edu.dev.java.test;
public class BaseClass {//baseclass concept
	
	private int add(int a, int b) {
		int c = a+b;
		return c;
	}
	private void test1() {
		System.out.println("hai how are u");

	}
	private void test2() {
		System.out.println("India");
		for (int i = 0; i < 5; i++) {
			System.out.println("Don don");
		}

	}
   public static void main(String[] args) {
	BaseClass b = new BaseClass();
	b.test1();
	b.test2();
	System.out.println(b.add(10, 30));
	System.out.println(b.add(20, 30));
	System.out.println(b.add(1000, 5000));
	System.out.println(b.add(2000, 6000));
	System.out.println("Hai tamilnadu");
}

}
	
	
	
	


		
		


