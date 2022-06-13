package org.java.array;

public class ArrayEx4 {

	public static void main(String[] args) {
		System.out.println("배열");
		
		int[][] arr1= new int[4][3];
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);

		System.out.println(arr1.length);	//행 갯수
		System.out.println(arr1[0].length);	//열 갯수
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		System.out.println(arr1[3].length);
		
		int a=1;	//밖에 있어야 a가 초기화가 되지 않아서 12까지 초기화된다.
		for(int i=0;i<arr1.length;i++) {
			
			System.out.println(i+"행");
			
			for(int j=0;j<arr1[i].length;j++) {
				//1~12까지 초기화
				arr1[i][j]=a++;

				System.out.print(arr1[i][j]+" ");	
			}
			System.out.println();
		}
		
	}
}
