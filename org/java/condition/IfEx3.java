package org.java.condition;

public class IfEx3 {

	public static void main(String[] args) {
		System.out.println("if 조건이여러개일때");
		
		// grade가 90이상이면 A, 80이상이면 B, 70이상이면 C 60이상이면 D
		//60미만이면 F를 콘솔에 출력하는 프로그래밍을하세요
		//if~else if를 사용해보세요
		
		int grade=90;
		
		if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80) {
			System.out.println("B");
		}else if(grade>=70) {
			System.out.println("C");
		}else if(grade>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
		
		
	}
}
