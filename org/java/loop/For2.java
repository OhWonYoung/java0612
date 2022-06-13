package org.java.loop;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("for문");
		// 구구단
		// 단 2 3456789
		// 하 123456789

		// 2~9단 출력
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단 입니다.");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}

		// 9단부터 2단까지 출력
		System.out.println("==========================================");

		for (int i = 9; i > 1; i--) {
			System.out.println(i + "단 입니다.");
			for (int j = 9; j > 0; j--) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		System.out.println("==========================================");

		// Scanner 클래스 이용해서 시작 단을 입력받아서 구구단을 입력단~9단까지 출력
		System.out.println("구구단을 입력해주세요");
		Scanner scn = new Scanner(System.in);

		System.out.println("시작 단을 입력해주세요");
		int startNum = scn.nextInt();
		System.out.println("끝 단을 입력해주세요");
		int endNum = scn.nextInt();

		System.out.println(startNum + " " + endNum);
		if (startNum > endNum) {//이럴땐 else에 for 문에 넣어야한다.
			System.out.println("시작단이 끝단보다 작거나 같아야합니다");
		} else {
			for (int i = startNum; i < endNum + 1; i++) {
				System.out.println(i + "단 입니다.");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + (i * j));
				}
			}

		}

		scn.close();

	}
}
