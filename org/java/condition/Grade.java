package org.java.condition;

public class Grade {
	//필드,프로퍼티
	private int kor; // 인스턴스맴버(필드, 프로퍼티)
	private int eng; // 인스턴스맴버(필드, 프로퍼티)
	private int math; // 인스턴스맴버(필드, 프로퍼티)

	//contstruct(생성자)결국 메서드
	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//method(메서드)
	public void sumGrade() {
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		int sum = kor + eng + math;
		System.out.println("총점: " + sum);
	}
	//method(메서드)
	public void avgGrade() {
		int sum = kor + eng + math;
		double avg = (double) sum / 3;
		System.out.println("평균: " + avg);
	}
	//method(메서드)
	public double avgGet() {
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		return avg;
	}
	
	
}
