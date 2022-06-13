package org.java.scanner;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		System.out.println("Scanner 실습");

		System.out.println("정수형 숫자를 입력하세요.");

		Scanner scn = new Scanner(System.in); // 콘솔에 입력
		// new -> 객체 생성 연산자(객체의 주소값 생성)

		System.out.println("첫번쨰 숫자 입력");
		int i1 = scn.nextInt();// 정수형 data 입력
		System.out.println("입력값: " + i1);

		System.out.println("두번째 숫자 입력");
		int i2 = scn.nextInt();
		System.out.println("입력값: " + i2);

		System.out.println(i1 + "+" + i2 + "=" + (i1 + i2));
		System.out.println(i1 + "-" + i2 + "=" + (i1 - i2));
		System.out.println(i1 + "/" + i2 + "=" + (i1 / i2));
		System.out.println(i1 + "*" + i2 + "=" + (i1 * i2));

		System.out.println("연산자를 입력해 보세요.");

		String str = scn.next();// 문자열을 입력

		System.out.println("입력된 연산자: " + str);

		scn.close();// 스케너클래스는 입력창을 열면 클로즈로 닫아주어야한다

	}
}
