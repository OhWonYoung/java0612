package org.java.operator;

public class operator10 {

	public static void main(String[] args) {
		System.out.println("단항 연산자");
		// 시험에 잘나옴 해깔리지 말것. 기호가 뒤에 있으면(i++,i--) 선처리
		// 앞에 있으면(++i,--i) 후처리
		int i = 10;

		// 선처리 후증가
		System.out.println(i++); // i=10
		System.out.println(i);// i=11

		// 선증가 후처리
		System.out.println(++i); // i=12
		System.out.println(i); // i=12

		// 선처리 후감소
		System.out.println(i--); // i=12
		System.out.println(i); // i=11

		// 선감소 후처리
		System.out.println(--i); // i=10
		System.out.println(i); // i=10

		// for문에서는 증감 연산자가 선처리, 후처리 상관없이 결과가 똑같다.(아주 중요함.)

		for (int i1 = 0; i1 < 10; i1++) {
			System.out.print(i1 + " ");
		}

		System.out.println(" ");

		for (int i1 = 0; i1 < 10; ++i1) {
			System.out.print(i1 + " ");
		}

	}
}
