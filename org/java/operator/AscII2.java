package org.java.operator;

import java.util.Scanner;

public class AscII2 {

	public static void main(String[] args) {

		System.out.println("대문자 또는 소문자를 입력해주세요 (65~90 && 95~112)");

		Scanner scn = new Scanner(System.in);
		int alpa = scn.nextInt();// 정수형숫자

		if (alpa > 64 && alpa < 91) {
			System.out.println("입력값 : " + alpa);
			System.out.println("대문자 : " + (char) alpa);

			int upAlpa = alpa + 32;// int로 연산 후 char로 형변환 대문자와 소문자는 고정적으로 32차이가 난다
			System.out.println(upAlpa);
			System.out.println("소문자 : " + (char) upAlpa);
		} else if (alpa > 96 && alpa < 113) {
			System.out.println("입력값 : " + alpa);
			System.out.println("소문자: " + (char) alpa);

			int downAlpa = alpa - 32;
			System.out.println(downAlpa);
			System.out.println("대문자 : " + (char) downAlpa);

		} else {
			System.out.println("다시 65~90 && 97~112 사이의 정수를 입력해주세요");
		}

		scn.close();

	}
}
