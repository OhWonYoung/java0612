package org.java.condition;

import java.util.Scanner;

public class GradeMain {
	public static void main(String[] args) {
		System.out.println("국어, 영어, 수학 점수를 입력, 총점, 평균, 학점(평균)");
		
		Scanner scn=new Scanner(System.in);
		System.out.println("국어 점수 입력");
		int kor=scn.nextInt(); // 국어 점수
		
		System.out.println("영어 점수 입력");
		int eng=scn.nextInt(); // 영어 점수
		
		System.out.println("수학 점수 입력");
		int math=scn.nextInt(); // 수학 점수

		
		Grade grade=new Grade(kor,eng,math);
		
		grade.sumGrade();
		grade.avgGrade();
		double avg=grade.avgGet(); // 평균값 반환
		
		// 학점(평균)
		if(avg>=90) {
			if(avg>=95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if(avg>=80) {
			if(avg>=85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if(avg>=70) {
			if(avg>=75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else if(avg>=60) {
			if(avg>=65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}
	}
}