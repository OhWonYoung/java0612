package org.java.array;

public class ArrayEx6 {

	public static void main(String[] args) {
		System.out.println("�迭");
		//\t ��Ű
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
		int scoreLength = score.length; //�迭�� ����
		
		int totalSum=0;
		System.out.println("�⸻��� ����ǥ");
		System.out.println("��ȣ \t���� \t���� \t���� \t���� \t���");
		System.out.println("============================================");
		
		for(int i=0;i<scoreLength;i++) {
			int sum=0;
			System.out.print((i+1)+"\t");//��ȣ
			kor+=score[i][0];		//score�迭�� 0���� �հ�(����)
			math+=score[i][1];		//score�迭�� 1���� �հ�(����)
			eng+=score[i][2];		//score�迭�� 2���� �հ�(����)
				
			for(int j=0;j<score[i].length;j++) {//����� 
				System.out.print(score[i][j]+"\t");//�������� ����
				sum+=score[i][j];//����
				totalSum+=score[i][j];
			}
			avg = (double) sum/scoreLength;		//���(�ݿø�)
			System.out.println(sum+"\t"+avg);
		}
		System.out.println("============================================");
		System.out.println("����:\t"+kor+"\t"+math+"\t"+eng+"\t"+totalSum);
	}
}
