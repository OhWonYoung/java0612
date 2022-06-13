package org.java.operator;

public class operator3 {

	public static void main(String[] args) {
		System.out.println("논리 연산자");
		System.out.println("&& 모든 조건이 true 일떄만 true");

		String userId = "m1111";
		String userPw = "1111";

		System.out.println(userId == "m1111" && userPw == "1111");
		System.out.println(userId == "m1111" && userPw == "2111");
		System.out.println(userId == "m1112" && userPw == "1111");
		System.out.println(userId == "m1112" && userPw == "2111");

		if (userId == "m1111" && userPw == "1111") {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		System.out.println("|| 하나이상의 조건이 true이면 결과 값이 true");

		if (userId != "m1111" || userPw != "1111") {
			System.out.println("로그인 실패");// 위보단 아래를 많이 사용함
		} else {
			System.out.println("로그인 성공");
		}

	}
}
