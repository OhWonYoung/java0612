package org.java.oop;

//����� ���� Ÿ��
public class ClassBasic {

	//�ʵ�(�Ӽ�)
	public String userId;		//�ν��Ͻ��ɹ�
	public String userPw;		//�ν��Ͻ��ɹ�
	public int userAge;			//�ν��Ͻ��ɹ�
	//ĸ��ȭ
	private String projectName;	//�ν��Ͻ��ɹ� , 
	//Ŭ�����ɹ�(static)
	public static int projectYear;
	
	public ClassBasic(){
		//��ü������ �ʿ��� Ư���� �޼���
		System.out.println("������(construct)");
	}
	
	//�޼���
	//�ν��Ͻ� �޼���
	public void instanceMathod() {
		System.out.println("�ν��Ͻ� �޼���");
	}
	//Ŭ�����ż���,Ŭ�����ɹ�(static)
	public static void classMathod() {
		System.out.println("Ŭ�����޼���");
	}
	
	//getters, setters
	//private �ɹ�(�ʵ�)�� �ʱ�ȭ set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//private �ɹ�(�ʵ�)�� get
	public String getProjectName() {
		return this.projectName;//ȣ���� �װ��� ��ȯ�Ѵ�.
	}


	
	
	
	
	
	
}
