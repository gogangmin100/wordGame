package javawin01;

import java.util.Scanner;

public class day20250204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			while(true) {
				System.out.println("�̸��� �Է��ϼ���");
				String name = in.nextLine();
				System.out.println("�Է��Ͻ� �̸���" +name);
				System.out.println("�Է��Ͻ� �̸���" +name.length());
				System.out.println("���̸� �Է��ϼ���");
				int age = in.nextInt();
				System.out.println("�Է��Ͻ� ���̴�" +age);
				System.out.println("��̸� �Է��ϼ���");
				String hobby = in.nextLine();
				System.out.println("��̷�"+ hobby+"�� �Է��ϼ̽��ϴ�");
			}
		}

	}

