package org.java.array;

import java.util.Stack;

public class ArrayEx1 extends Object {
						// ���� �Ǿ�����
	public static void main(String[] args) {
		System.out.println("�迭");

		// int arr2[] = new int[5];//�Ѵ� �ȴ�
		// int[] arr2 = new int[5];//�Ѵ� �ȴ�
		// int���� �����͸� ���� �� �� �ִ� �迭 arr1�� �����ߴ�.

		int[] arr1 = new int[5];// �Ѵ� �ȴ�.
		// �ʱ�ȭ

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
		
		
		
		//for���� �̿��ؼ� arr1�� 012345�� �ʱ�ȭ �ϰ� �ֿܼ� �� ���� ���� ����غ�����
		//���ϴ� ���� ������ ����, ������ �ʴ°��� ���ڿ� length(����)
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=i+1;
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
		
		
		System.out.println("�迭�� �Ѱ���: " + arr1.length);
		System.out.println("�迭�� ������ �ε���: " + (arr1.length - 1));

		
		
		
		// int���� �����͸� ���� �� �� �ִ� �迭 arr3�� �����ϰ� int�� 1,2,3,4,5�� �ʱ�ȭ�ߴ�.
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
		// int���� �����͸� ���� �� �� �ִ� �迭 arr4�� �����ϰ� int�� 1,2,3,4,5�� �ʱ�ȭ�ߴ�.
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
		int lottoSize = lotto.length;// ������ �־��ִ°��� ����.
		for (int i=0;i<lottoSize; i++) {
			lotto[i]=i+1; //0~44����... 1~45���� �־���
			System.out.print("lotto["+i+"]="+lotto[i]+" ");
			if(i%5==0) {
				System.out.println(" ");
			}
		}
		
		
		
		
	}
}
