package org.java.condition;

import java.util.Scanner;

public class IfEx6 {

	public static void main(String[] args) {
		System.out.println("if문 예제");
		
		System.out.println("국어, 영어, 수학 점수를 입력, 총점, 평균, 학점(평균)");
		//Scanner 클래스 이용해서 변수타입은 적절히, 조건문 if이ㅛㅇ
		//국어,영어,수학 (0~100정수), 총점(정수), 평균(double)
		//평균(double)을이용해서 학점을 계산해보세요
		//95이상이면 A+ 90이상A
		//85이상이면 B+ 80이상B
		//75이상이면 C+ 70이상C
		//65이상이면 D+ 60이상D
		//60미만이면 F
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("국어 성적을 입력해주세요");
		int kor = scn.nextInt();
		
		System.out.println("영어 성적을 입력해주세요");
		int eng = scn.nextInt();
		
		System.out.println("수학 성적을 입력해주세요");
		int math = scn.nextInt();
		
		System.out.println("국어점수 : " +kor+" 영어점수 : "+eng+ " 수학점수 : "+math);
		
		int sum = kor+eng+math;
		System.out.println("총점 " +sum+"점입니다.");
		
		double avg = (double)sum/3;
		System.out.println("평균 " +avg +"점 입니다.");
		
		
		if(avg>=90) {
			if(avg>=95) {
				System.out.println("학점: A+");
			}else {
				System.out.println("학점: A");
			}
		}else if(avg>=80) {
			if(avg>=85) {
				System.out.println("학점: B+");
			}else {
				System.out.println("학점: B");
			}
		}else if(avg>=70) {
			if(avg>=75) {
				System.out.println("학점: C+");
			}else {
				System.out.println("학점: C");
			}
		}else if(avg>=60) {
			if(avg>=65) {
				System.out.println("학점: D+");
			}else {
				System.out.println("학점: D");
			}
		}else {
			System.out.println("학점: F");
		}
		
		scn.close();
		
		
		
		
	}
}
