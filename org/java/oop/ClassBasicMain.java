package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {
		
		
		//Ŭ���� �ɹ�, ��ü�� �������� �ʾƵ� ��밡��(����,������ �ʴ°�) static
		ClassBasic.projectYear=2022;
		ClassBasic.classMathod();
		
		// new -> ��ü ����������
		//�ν��Ͻ�ȭ(��üȭ)
		ClassBasic class1 = new ClassBasic();
		//���� ��Ű��(���丮)�� import �� �ʿ䰡 ����.
		//�ν��Ͻ� �ɹ� -> ��ü�� ������ �� ���� ����
		class1.userId="m111";
		class1.userPw="111";
		class1.userAge=10;
		class1.instanceMathod();
				
		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);
		
		//private �ɹ� �ʱ�ȭ setters
		class1.setProjectName("JAVAPROJECT2022");
		//private �ɹ� getter
		String projectName = class1.getProjectName();// �޼��带 ȣ���ϸ� 
		System.out.println(projectName);
		
		System.out.println("===============================");
		//�ν��Ͻ�ȭ(��üȭ)
		ClassBasic class2 = new ClassBasic();
		
		class2.userId="a111";
		class2.userPw="2222";
		class2.userAge=20;
		class2.instanceMathod();
	
		System.out.println(class2.userId);
		System.out.println(class2.userPw);
		System.out.println(class2.userAge);
		
		System.out.println("===============================");
		
	}
}
