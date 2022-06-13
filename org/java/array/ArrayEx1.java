package org.java.array;

import java.util.Stack;

public class ArrayEx1 extends Object {
						// 생략 되어있음
	public static void main(String[] args) {
		System.out.println("배열");

		// int arr2[] = new int[5];//둘다 된다
		// int[] arr2 = new int[5];//둘다 된다
		// int형의 데이터를 저장 할 수 있는 배열 arr1을 선언했다.

		int[] arr1 = new int[5];// 둘다 된다.
		// 초기화

		//arr1[0]=1;
		//arr1[1]=2;
		//arr1[2]=3;
		//arr1[3]=4;
		//arr1[4]=5;
		//System.out.println(arr1[0]);
		//System.out.println(arr1[1]);
		//System.out.println(arr1[2]);
		//System.out.println(arr1[3]);
		//System.out.println(arr1[4]);
		
		
		
		//for문을 이용해서 arr1을 012345로 초기화 하고 콘솔에 각 번지 값을 출력해보세요
		//변하는 값은 변수에 설정, 변하지 않는것은 문자열 length(길이)
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=i+1;
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
		
		
		System.out.println("배열의 총갯수: " + arr1.length);
		System.out.println("배열의 마지막 인덱스: " + (arr1.length - 1));

		
		
		
		// int형의 데이터를 저장 할 수 있는 배열 arr3을 선언하고 int형 1,2,3,4,5로 초기화했다.
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
		// int형의 데이터를 저장 할 수 있는 배열 arr4을 선언하고 int형 1,2,3,4,5로 초기화했다.
		int[] arr4 = { 1, 2, 3, 4, 5 };

		char[] chArr1=new char[5];
		for(int i=0;i<chArr1.length;i++) {
			System.out.println("chArr1["+i+"]="+chArr1[i]);
		}
		
		char[] chArr2=new char[] {'a','b','c','d','e'};
		for(int i=0;i<chArr2.length;i++) {
			System.out.println("chArr2["+i+"]="+chArr2[i]);
		}
		String[] strArr = new String[] {"J","A","V","A","22"};
		for(int i=0;i<strArr.length;i++) {
			System.out.println("strArr["+i+"]="+strArr[i]);
		}
		
		
		int[] lotto=new int[45];
		int lottoSize = lotto.length;// 변수에 넣어주는것이 좋다.
		for (int i=0;i<lottoSize; i++) {
			lotto[i]=i+1; //0~44번지... 1~45까지 넣어줌
			System.out.print("lotto["+i+"]="+lotto[i]+" ");
			if(i%5==0) {
				System.out.println(" ");
			}
		}
		
		
		
		
	}
}
