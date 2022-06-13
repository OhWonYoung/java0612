package org.java.array;

public class ArrayEx6 {

	public static void main(String[] args) {
		System.out.println("배열");
		//\t 탭키
		int[][] score = {
				{100,66,77},
				{88,66,88},
				{80,46,97},
				{70,88,80},
				{100,90,88}
		};
	
		int kor = 0;
		int math = 0;
		int eng = 0;
		double avg = 0.0;
		int scoreLength = score.length; //배열의 길이
		
		int totalSum=0;
		System.out.println("기말고사 성적표");
		System.out.println("번호 \t국어 \t수학 \t영어 \t종합 \t평균");
		System.out.println("============================================");
		
		for(int i=0;i<scoreLength;i++) {
			int sum=0;
			System.out.print((i+1)+"\t");//번호
			kor+=score[i][0];		//score배열의 0번지 합계(국어)
			math+=score[i][1];		//score배열의 1번지 합계(수학)
			eng+=score[i][2];		//score배열의 2번지 합계(영어)
				
			for(int j=0;j<score[i].length;j++) {//행실행 
				System.out.print(score[i][j]+"\t");//각과목의 점수
				sum+=score[i][j];//총점
				totalSum+=score[i][j];
			}
			avg = (double) sum/scoreLength;		//평균(반올림)
			System.out.println(sum+"\t"+avg);
		}
		System.out.println("============================================");
		System.out.println("과목별:\t"+kor+"\t"+math+"\t"+eng+"\t"+totalSum);
	}
}
