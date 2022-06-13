package org.java.loop;

public class For1 {

	public static void main(String[] args) {
		System.out.println("for문");
		
		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			System.out.print(i+" ");
				System.out.print((i+1)+" , ");
			//1~10까지 콘솔에 출력
//			int i2=i+1;
//			System.out.println(i2);
		}
		System.out.println("===============================");
		
		//마지막 , 찍지 않기
		for(int i2=0;i2<10;i2++) {
//			if(i2==9) { // 중간중간 제외하고싶은것이 있을때
//				System.out.print(i2+1);
//			}else {
//				System.out.print((i2+1)+" , ");
//			}
			
			if(i2==9) {// 마지막것을 제외하고 싶을때 자주 씀
				System.out.print(i2+1);
				break;//하위 명령문을 실행안하고 반복문이 종료
			}
			System.out.print((i2+1)+" , ");
		}//break문
		
		System.out.println("======================================================");
		
		for(int i=0;i<10;i++) {
			
//			String url="";
			System.out.println("url(img/bg"+i+".jpg) no-repeat 50%/cover");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
