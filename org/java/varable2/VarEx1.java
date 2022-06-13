package org.java.varable2;

public class VarEx1 {

	public static void main(String[] args) {
		System.out.println("변수, 자료형, 형변화");

		int i = 10;
		char ch = 'a';

		ClassBasic c1 = new ClassBasic();

		// 사용자 정의 타입(클래스)
		// 인스턴스화(객체화) new로 만든 v1이 인스턴스
		VarSub v1 = new VarSub();
		v1.num1 = 100;
		v1.num2 = 200;
		v1.sum();
		v1.method(200, 500);

		String str1 = new String();
		str1 = "문자열 객체형 자료형";
		System.out.println(str1);

	}
}
