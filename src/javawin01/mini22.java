package javawin01;

import java.util.Random;
import java.util.Scanner;

public class mini22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] words = {"apple", "banana","cherry","kiwi","lemon","mango","pear","plum","tomato","egg"};
		
		
		int score = 0;
		
		System.out.println("Ÿ�� ���� ����");
		System.out.println("����Ű�� ������ ���� ����");
		scanner.nextLine(); 
		
		for(int i=0; i<10; i++) {
			System.out.println(i+"�� ° ������ ���ôܾ��Դϴ�.");
			String trywords = words[random.nextInt(words.length)];  //trywords���� ���� -> ���ôܾ�
			System.out.println("\n���ܾ��Է�" + trywords);
			
			System.out.println("�Է� :");
			String in = scanner.nextLine();  // in�������� -> Ű����� �Է� ���� �ܾ�
			
			if(in.equals(trywords)) {  // ���ǹ� in���ڿ��� trywords�� ���ٸ�
				System.out.println("���� 10��");  
				score +=10;   //10�� ����.
				System.out.println("������:"+ score);				
			}else {
				System.out.println("�κ������� ä���� ���ϴ�.");
				
			
				// �۾�����
				for(int j=0; j < trywords.length()&&j<in.length(); j++){  // j 0 1 2 3 4 ~~~ ���þ� ���ڿ��� ����...
					if(trywords.charAt(j)==in.charAt(j)) {
						System.out.println(in.charAt(j)+"�� �κ������� �ֽ��ϴ�. ");
						score+=1;
					}
				}
				
				
			}
		}
		System.out.println("\n��������" + score +"��");
		
	}

}
	