package org.java.condition;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {

		System.out.println("switch문");

		Scanner scn = new Scanner(System.in);

		System.out.println("첫번째 정수입력");
		int num1 = scn.nextInt();// 정수입력

		System.out.println("두번째 정수 입력");
		int num2 = scn.nextInt();// 정수입력

		System.out.println("연산기호 입력");
		char op = scn.next().charAt(0);// char (한글자) 문자열에서 0번째
		// == String op =scn.next();

		int result = 0; // 초기화 필요
		// 만약에 op가 (+ - * / % ) 하나면
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}// break문 위치

		System.out.println("연산의 결과 : " + num1 + " " + op + " " + num2 + " = " + result);

		scn.close();
	}
}
