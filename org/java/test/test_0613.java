package org.java.test;

import java.util.Scanner;

public class test_0613 {
	
	public static void main(String[] args) {
	
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���۴��� �Է����ּ���");
		int startNum = scn.nextInt();
		System.out.println("������ �Է����ּ���");
		int endNum = scn.nextInt();
		
		if(startNum>endNum) {
			System.out.println("���۴��� ���ܺ��� ������ �����ϴ�.");
		}else {
				for(;startNum<endNum+1; startNum++) {
					System.out.println(startNum+"�� �Դϴ�.");
					for(int i=1;i<10;i++) {
						System.out.println(startNum+" X  "+endNum+ " = "+(startNum*i));
			
					}
				}
			
			
		}
		
	
		
		
		
	}
}
