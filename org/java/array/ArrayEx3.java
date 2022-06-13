package org.java.array;

public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("배열");
		
		
		//CAFE를 바이너리 코드로 변환 시키는법
		char[] ch = {'C','A','F','E'};
		
		String s1 = new String(ch);//char형 배열을 String으로 변환
		System.out.println(s1);
		System.out.println(s1.equals("CAFE"));
		
		String[] binnery= {
				"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111",
		};
		
		String result="";
		
		System.out.println('C'>='0');// 67 >= 45
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {// '0'=48 '9'=57
				result+=binnery[ch[i]-'0'];
			}else {
				result+=binnery[ch[i]-'A'+10];// 'A'=65
				//'C(67)' -'A(65)'+ 10 = 12 --> "1100" "1010" "1111" "1110"
			}
		}
		System.out.println("ch="+new String(ch));
//		System.out.println("ch="+String.copyValueOf(ch));
		System.out.println(result);
		
		
		
	}
}
