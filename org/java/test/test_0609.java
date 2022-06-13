package org.java.test;

import java.util.Scanner;

public class test_0609 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("국어 점수를 입력해주세요.");
		double ko = scn.nextInt();

		System.out.println("영어 점수를 입력해주세요.");
		double en = scn.nextInt();

		System.out.println("수학 점수를 입력해주세요.");
		double ma = scn.nextInt();

		int to = (int) (ko + en + ma);
		System.out.println("점수 총합은 " + to + "점 입니다.");

		double aver = (ko + en + ma) / 3;
		System.out.println("평균 점수는 " + aver + "점 입니다.");

	}
}
