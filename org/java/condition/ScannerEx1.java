package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		System.out.println("쿼리문을 입력해서 (insert,update,select,delete)");
		Scanner scn = new Scanner(System.in);

		System.out.println("명령어를 입력해주세요");
		String str = scn.nextLine();

		if (str.equals("insert")) {
			System.out.println(str + " - 회원 가입페이지로 이동합니다");
		} else if (str.equals("update")) {
			System.out.println(str + " - 회원 수정페이지로 이동합니다");
		} else if (str.equals("select")) {
			System.out.println(str + " - 회원 조회페이지로 이동합니다");
		} else if (str.equals("delete")) {
			System.out.println(str + " - 회원 탈퇴페이지로 이동합니다");
		} else {
			System.out.println(str + " - 잘못된 입력입니다.");
		}

		scn.close();

	}
}
