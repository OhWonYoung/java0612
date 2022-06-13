package org.java.condition;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		System.out.println("if문");
		
		//조건이 true일때만 실행
		
		System.out.println("조건이 하나일때");
		int num=10;
		if(num>=10) {
			System.out.println("10보다 크거나 같습니다.");
		}
		if(num>=10) System.out.println("10보다 크거나 같습니다");//두줄보단 한줄로 작성
		if(num>=10) 
			System.out.println("10보다 크거나 같습니다");
		
		//전부다 사용 가능하지만 2줄이상이면 {}를 사용해야한다.
		
		//Scanner 이용해서 정수를 입력받아서 100보다 크면 콘솔에 "100보다 크다"
		//if 문 하나만 이용해서 프로그램해보세요.		
		
		Scanner scn = new Scanner(System.in);
		int key = scn.nextInt();
		if(key>100) {
			System.out.println("100보다 크다.");
		}
		
		//Scanner 아이디를 입력해서 아이가다 "root"면 "즐거운 쇼핑되세요" 표시
		//if 문 하나만 이용해서 프로그래밍 해보세요.
		
		System.out.println("아이디 입력");
		String userId = scn.next();
		if(userId.equals("root"))
			System.out.println("즐거운 쇼핑되세요.");
		
		
		
		
	}
}
