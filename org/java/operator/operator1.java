package org.java.operator;

public class operator1 {

	public static void main(String[] args) {
		System.out.println("산술 연산자");

		int num1 = 99;
		int num2 = 5;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println((double) num1 / num2);// (double)(num1/num2)로 쓰면 사칙연산에 따라 뒤의 /부터 계산하기 때문에 19.0이 된다.
		System.out.println(num1 % num2);

	}
}
