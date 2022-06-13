package org.java.condition;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		System.out.println("조건이 두개일때");//삼항연산자
		
		int num1=10;
		int num2=20;
		
		if(num1>10) {
			System.out.println("10보다 큽니다.");
		}else {
			System.out.println("10보다 크지 않습니다.");
		}
		System.out.println("=================================");
		
		if(num1>=10 && num2<=20) {
			System.out.println("조건을 만족합니다.");
		}else {
			System.out.println("조건을 충족시키지 못했습니다.");
		}
		
		//Scanner 이용해서 아이디, 비밀번호를 입력해서 문자열("root", "1111")
		// 아이디와 비밀번호가 맞으면"즐거운 효핑되세요"
		//하나라도 틀리면 "회원이 아니시군요"가 콘솔에 표시되도록 프로그래밍
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디 입력");
		String userId= scn.nextLine();
		
		System.out.println("비밀번호 입력");
		String userPw = scn.nextLine();
		
		if(userId.equals("root") && userPw.equals("1111")) {
			System.out.println("즐거운 쇼핑되세요");
		}else {
			System.out.println("회원이 아니시군요");
		}
		
		System.out.println("======================");
		
		if(!userId.equals("root") || !userPw.equals("1111")) {
			System.out.println("즐거운 쇼핑되세요");
		}else {
			System.out.println("회원이 아니시군요");
		}
		
		
	}
}
