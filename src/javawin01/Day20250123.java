package javawin01;

import java.util.Scanner;

public class Day20250123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] train = new String[5];
		
		for(int i =0; i<5; i++) {
			System.out.println((i+1) + "������ �Է�");
			train[i] = s.nextLine();
		}
		System.out.println("��ϵ� ����");
		for(int i =0; i<5; i++) {
			System.out.println((i+1) + train[i]);					
		}
		
		System.out.println("�˻��� ����");
		String name = s.nextLine();
		for(int i =0; i<5; i++) {
			if(train[i].equals(name)) {
				System.out.println("��ġ�մϴ�");			
			}
			
			if(!train[i].equals(name)) {
				System.out.println("����ġ�մϴ�");	
				
			}
		}
		
	}
}


