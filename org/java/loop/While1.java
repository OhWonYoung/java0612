package org.java.loop;

public class While1 {

	public static void main(String[] args) {
		System.out.println("while");
		
		int i=0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("=======================================");
		
		int i2=0;
		while(true) {
			System.out.println(i2);

			if(i2>=9)break;
			
			i2++;
		}
//		while(true) {
//			
//			if(i2<10) {
//			System.out.println(i2);
//			i2++;
//			break;
//			}
//		}
	System.out.println("=======================================");
		
	
	
	
	
	}
}
