package org.java.condition;

import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		
		System.out.println("switch 문");
		
		Scanner scn = new Scanner(System.in);
											//C R U D
		System.out.println("쿼리문을 입력해주세요 (insert, update, select, delete)");
		String input = scn.next();//String = "문자열" char = '문자'(따옴표를 구분해서 사용해야한다.)
		
		switch(input) {
		case "insert":
			System.out.println(input+" - 회원가입 페이지로 이동합니다.");
			break;
		case "update":
			System.out.println(input+" - 회원수정 페이지로 이동합니다.");
			break;
		case "select":
			System.out.println(input+" - 회원조회 페이지로 이동합니다.");
			break;
		case "delete":
			System.out.println(input+" - 회원탈퇴 페이지로 이동합니다.");
			break;
		default:
			System.out.println(input+" - 쿼리문 입력오류 입니다.");
		}

		//charAt()--문자열에서 특정글자를 뽑아냄
		System.out.println("java2022".charAt(0));//문자열0(j)
		System.out.println("java2022".charAt(1));//문자열1(a)
		System.out.println("java2022".charAt(2));//문자열2(v)
		System.out.println("java2022".charAt(3));//문자열3(a)
		System.out.println("java2022".charAt(4));//문자열4(2)
		System.out.println("java2022".charAt(5));//문자열5(0)
		System.out.println("java2022".charAt(6));//문자열6(2)
		System.out.println("java2022".charAt(7));//문자열7(2)
		
		
		
		
		
		scn.close();
	}
}
