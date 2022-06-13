package org.java.operator;

public class operator11 {

	public static void main(String[] args) {
		System.out.println("삼항 연산자");

		int i = 10;
		
		//결과값을 담을수 있는 그릇에 담아야한다. (반환되는 결과값에 맞추어서)
		System.out.println(i > 10 ? true : false);
		String rs = i > 10 ? "10보다 큽니다" : "10보다 작습니다";
		boolean bool = i > 10 ? true : false;
		int i2 = i > 10 ? 1 : 0;
		double d = i > 10 ? 1.1 : 0.1;
		char ch = i > 10 ? 'a' : 'b';

		
		System.out.println(rs);
		System.out.println(bool);
		System.out.println(i2);
		System.out.println(d);
		System.out.println(ch);
	}
}
