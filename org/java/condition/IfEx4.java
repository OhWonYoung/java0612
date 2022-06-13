package org.java.condition;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		System.out.println("조건이 여러개");
		
		//Scanner 클래스를 이용해서 변수 grade 정수값을 입력
		//grade가 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D
		//60미만이면 F 를 콘솔에 출력하는 프로그래밍을하세요
		//if ~ else if 를 사용해보세요
		
		System.out.println("성적을 입력하세요.");
		Scanner scn = new Scanner(System.in);
		
		int grade = scn.nextInt();
		
		if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80) {
			System.out.println("B");
		}else if(grade>=70) {
			System.out.println("C");
		}else if(grade>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
