package org.java.loop;

public class While3 {

	public static void main(String[] args) {
		System.out.println("do ~ while");

		for (int i2 = 2; i2 < 1; i2++) {// 실행이 안됨
			System.out.println(i2);
		}

		int i3 = 2;
		while (i3 < 1) {// 실행이 안됨
			System.out.println(i3);
		}

		int i = 2;
		do {
			System.out.println(i);
		} while (i < 1);

		
		int i4=2;
		
		do {
			System.out.println(i4+"단입니다");
		
			int j=1;
			do {
				System.out.println(i4+"X" + j+ "="+(i4*j));
				j++;
			}while(j<10);
			i4++;
		}while(i4<10);
	}
}
