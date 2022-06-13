package org.java.scanner;

import java.util.Scanner;

public class VarExTest {

	public static void main(String[] args) {
		
		/*
		 반지름 (정수)을 입력해서 원의 넓이를 구하세요.
		 결과값 콘솔에 출력
		 원주율 PI = 3.14(final 상수)
		 반지름 radius
		 원의 넓이 = 반지름* 반지름*PI
		 Scanner, nextInt(); 이용
		 */
		
		
		
		final double PI = 3.14;//final 상수는 대문자로만 작성하는게 국룰임
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("원의 넓이를 구하시오.");
		
		System.out.println("반지름을 입력해주세요.(정수형)");
		int radius = scn.nextInt();
		
//		double circleNum = radius*radius*PI;
		int circleNum = (int)(radius*radius*PI);//뒤에 수식을 같이 묶어주어야 된다.
		
		System.out.println(radius+"*"+radius+"*"+PI+"="+(radius*radius*PI));
		System.out.println("원의 넓이: "+circleNum);
		
//		System.out.println("입력한 반지름: " + radius);
		
//		System.out.println("원의 넓이는 "+radius*radius*PI+ " 입니다.");
		
		
		
	}
}
