package org.java.test;

import java.util.Scanner;

public class test_0609_sol {

	public static void main(String[] args) {
		System.out.println("국어 , 영어, 수학 점수를 입력하고 총점, 평균을 구하시오.");

		Scanner scn = new Scanner(System.in);

		System.out.println("국어 점수: ");
		int kor = scn.nextInt();

		System.out.println("수학 점수: ");
		int math = scn.nextInt();

		System.out.println("영어 점수: ");
		int eng = scn.nextInt();

		int sum = kor + math + eng;
		double avg = (double) sum / 3;

		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");

		scn.close();
	}
}
