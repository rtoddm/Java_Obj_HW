package java_calculator;

public class Calculator {
	
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 - num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public int square(int num1) {
		return num1 * num1;
	}
	
	
	public static void main(String[]arg) {
		
		Calculator hamAndCheese = new Calculator();
		
		System.out.println(hamAndCheese.add(4, 3));
		System.out.println(hamAndCheese.subtract(4, 3));
		System.out.println(hamAndCheese.multiply(4, 3));
		System.out.println(hamAndCheese.divide(4, 3));
		System.out.println(hamAndCheese.square(4));
	
		
	}
	

}
	

