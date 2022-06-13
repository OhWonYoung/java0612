package org.java.condition;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳을 입력하세요.");
		
		Scanner scn = new Scanner(System.in);
		
		String ch = scn.nextLine();
		
		switch (ch) {
		case "A":	// A이나 a
		case "a":
			System.out.println("A입니다.");
			break;
		case "B":	// B이나 b
		case "b":
			System.out.println("B입니다.");
			break;
		case "C":	// C이나 c
		case "c":
			System.out.println("C입니다.");
			break;
		default :
			System.out.println("A, B, C 이외의 알파벳입니다.");
		}
		scn.close();
	}
}
