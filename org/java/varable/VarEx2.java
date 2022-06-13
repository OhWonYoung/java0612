package org.java.varable;

public class VarEx2 {
	public static void main(String[] args) {

		System.out.println("변수, 데이터 타입");
		System.out.println("primitive type");

		// ===자바의 기본변수===
		// 정수형 데이터
		byte b = 10; // 정수형 데이터 1byte를 저장 할 수 있는 변수 b를 선언 하고 10으로 초기화 했다. b에 들어갈수있는 숫자가 -128 부터
						// +127까지 들어갈수있다.
		short s = 10; // 정수형 데이터 2byte를 저장 할 수 있는 변수 b를 선언 하고 10으로 초기화 했다.
		int i = 10; // 정수형 데이터 4byte를 저장 할 수 있는 변수 b를 선언 하고 10으로 초기화 했다.
		long l = 10L; // 정수형 데이터 8byte를 저장 할 수 있는 변수 b를 선언 하고 10으로 초기화 했다.
		// 실수형 데이터
		float f = 1.1F; // 실수형 데이터 4byte를 저장 할 수 있는 f를 선언하고 1.1로 초기화했다.
		double d = 1.1; // 실수형 데이터 8byte를 저장 할 수 있는 d를 선언하고 1.1로 초기화했다.
		// 문자형 데이터
		char ch = 'a'; // 문자형 데이터 2byte를 저장 할 수 있는 ch를 선언하고 'a'로 초기화했다.

		boolean bool = false; // boolean형 1byte를 저장 할 수 있는 변수 bool을 선언하고 false로 초기화했다.

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}

}
