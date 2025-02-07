package javawin01;

import java.util.Scanner;

public class minipo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		String id = in.nextLine();
		int cnt=0;
		
		for(int i = 0; i<id.length(); i++){
			
			if(id.charAt(i) =='@') {
				cnt++;
			}
		}
		
		if(cnt>0) {
			System.out.println("입력한 아이디에 특수문자가 포함되었습니다"+cnt+"개");
		}
		else {
			System.out.println("입력한 아이디에 특수문자가 포함되어있지않습니다");
		}

	}

}
