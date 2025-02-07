package javawin01;

import java.util.Scanner;

public class Day20250123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] train = new String[5];
		
		for(int i =0; i<5; i++) {
			System.out.println((i+1) + "기차명 입력");
			train[i] = s.nextLine();
		}
		System.out.println("등록된 기차");
		for(int i =0; i<5; i++) {
			System.out.println((i+1) + train[i]);					
		}
		
		System.out.println("검색할 기차");
		String name = s.nextLine();
		for(int i =0; i<5; i++) {
			if(train[i].equals(name)) {
				System.out.println("일치합니다");			
			}
			
			if(!train[i].equals(name)) {
				System.out.println("불일치합니다");	
				
			}
		}
		
	}
}


