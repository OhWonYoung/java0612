package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {
		
		
		//클래스 맴버, 객체를 생성하지 않아도 사용가능(공용,변하지 않는것) static
		ClassBasic.projectYear=2022;
		ClassBasic.classMathod();
		
		// new -> 객체 생성연산자
		//인스턴스화(객체화)
		ClassBasic class1 = new ClassBasic();
		//같은 패키지(디렉토리)는 import 할 필요가 없다.
		//인스턴스 맴버 -> 객체를 생성한 후 접근 가능
		class1.userId="m111";
		class1.userPw="111";
		class1.userAge=10;
		class1.instanceMathod();
				
		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);
		
		//private 맴버 초기화 setters
		class1.setProjectName("JAVAPROJECT2022");
		//private 맴버 getter
		String projectName = class1.getProjectName();// 메서드를 호출하면 
		System.out.println(projectName);
		
		System.out.println("===============================");
		//인스턴스화(객체화)
		ClassBasic class2 = new ClassBasic();
		
		class2.userId="a111";
		class2.userPw="2222";
		class2.userAge=20;
		class2.instanceMathod();
	
		System.out.println(class2.userId);
		System.out.println(class2.userPw);
		System.out.println(class2.userAge);
		
		System.out.println("===============================");
		
	}
}
