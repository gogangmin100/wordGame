package javawin01;

import java.util.Scanner;

public class minipo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���");
		String id = in.nextLine();
		int cnt=0;
		
		for(int i = 0; i<id.length(); i++){
			
			if(id.charAt(i) =='@') {
				cnt++;
			}
		}
		
		if(cnt>0) {
			System.out.println("�Է��� ���̵� Ư�����ڰ� ���ԵǾ����ϴ�"+cnt+"��");
		}
		else {
			System.out.println("�Է��� ���̵� Ư�����ڰ� ���ԵǾ������ʽ��ϴ�");
		}

	}

}
