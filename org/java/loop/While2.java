package org.java.loop;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		System.out.println("while 구구단");
		// 구구단 2~9eks
		int i=2;//1이면 i++이 아래로
		
		while(i<10) {
			System.out.println(i+"단 입니다.");

			int j=1;
			while(j<10) {
				System.out.println(i+" X "+j+" = "+(i*j));
				j++;
			}
			//j증가가 끝나고 i가 증가해야함
			i++;
		}
	
		System.out.println("==================================");
		
		//Scanner에서 입력단(정수)를 이용해서 구구단을 출력
		//ex)4입력하면 4~9단 출력
		System.out.println("시작단을 입력해주세요");
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		while(num<10) {
			System.out.println("::: "+num+"단 :::");
			int j=1;
			while(j<10) {
				System.out.println(num + " X "+ j + " = "+(num*j));
				j++;
			}
			num++;
		}
	
	}
}
