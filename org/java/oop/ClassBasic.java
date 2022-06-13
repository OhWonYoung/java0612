package org.java.oop;

//사용자 정의 타입
public class ClassBasic {

	//필드(속성)
	public String userId;		//인스턴스맴버
	public String userPw;		//인스턴스맴버
	public int userAge;			//인스턴스맴버
	//캡슐화
	private String projectName;	//인스턴스맴버 , 
	//클래스맴버(static)
	public static int projectYear;
	
	public ClassBasic(){
		//객체생성시 필요한 특수한 메서드
		System.out.println("생성자(construct)");
	}
	
	//메서드
	//인스턴스 메서드
	public void instanceMathod() {
		System.out.println("인스턴스 메서드");
	}
	//클래스매서드,클래스맴버(static)
	public static void classMathod() {
		System.out.println("클래스메서드");
	}
	
	//getters, setters
	//private 맴버(필드)를 초기화 set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//private 맴버(필드)를 get
	public String getProjectName() {
		return this.projectName;//호출함 그곳에 반환한다.
	}


	
	
	
	
	
	
}
