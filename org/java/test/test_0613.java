package org.java.test;

import java.util.Scanner;

public class test_0613 {
	
	public static void main(String[] args) {
	
		
		Scanner scn = new Scanner(System.in);
		System.out.println("시작단을 입력해주세요");
		int startNum = scn.nextInt();
		System.out.println("끝단을 입력해주세요");
		int endNum = scn.nextInt();
		
		if(startNum>endNum) {
			System.out.println("시작단이 끝단보다 작을수 없습니다.");
		}else {
				for(;startNum<endNum+1; startNum++) {
					System.out.println(startNum+"단 입니다.");
					for(int i=1;i<10;i++) {
						System.out.println(startNum+" X  "+endNum+ " = "+(startNum*i));
			
					}
				}
			
			
		}
		
	
		
		
		
	}
}
