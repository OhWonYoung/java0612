package org.java.loop;

public class For3 {

	public static void main(String[] args) {
		System.out.println("for문");
		
		System.out.println("1부터 100까지 짝수를 출력해보세요 (for)");
		
		System.out.println("1번 =====================================");

		for(int i=2; i<=100;i=i+2) {
			System.out.print(i + " ");
			if(i%10==0) {
				System.out.println(" ");
			}
		}
		System.out.println("2번 =====================================");
		
		for(int i=2; i<=100; i+=2) {
			System.out.print(i + " ");
			if(i%10==0) {
				System.out.println(" ");
			}
		}
		
		System.out.println("3번 =====================================");
		
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			if(i%10==0) {
				System.out.println(" ");
			}
		}
	
		System.out.println("홀수=====================================");
	
		for (int i=1; i<=100; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
			if(i%10==0) {
				System.out.println(" ");
			}
		}
		System.out.println("=====================================");
		
		System.out.println("1부터 100까지 짝수의 합을 출력");
		
		int sum=0;
		for (int i=1;i<101;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println("1부터 100까지 홀수의 합을 출력");
		
		int sum2=0;
		for (int i=1; i<101; i++) {
			if(i%2==1) {
				sum2+=i;
			}
		}
		System.out.println(sum2);
	
	
	}
}
