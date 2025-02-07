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
		
		System.out.println("타자 연습 게임");
		System.out.println("엔터키를 누를시 게임 시작");
		scanner.nextLine(); 
		
		for(int i=0; i<10; i++) {
			System.out.println(i+"번 째 게임의 지시단어입니다.");
			String trywords = words[random.nextInt(words.length)];  //trywords변수 선언 -> 지시단어
			System.out.println("\n영단어입력" + trywords);
			
			System.out.println("입력 :");
			String in = scanner.nextLine();  // in변수선언 -> 키보드로 입력 받은 단어
			
			if(in.equals(trywords)) {  // 조건문 in문자열과 trywords가 같다면
				System.out.println("정답 10점");  
				score +=10;   //10점 가산.
				System.out.println("총점수:"+ score);				
			}else {
				System.out.println("부분점수를 채점해 봅니다.");
				
			
				// 작업예정
				for(int j=0; j < trywords.length()&&j<in.length(); j++){  // j 0 1 2 3 4 ~~~ 지시어 문자열의 길이...
					if(trywords.charAt(j)==in.charAt(j)) {
						System.out.println(in.charAt(j)+"는 부분점수가 있습니다. ");
						score+=1;
					}
				}
				
				
			}
		}
		System.out.println("\n게임종료" + score +"점");
		
	}

}
	