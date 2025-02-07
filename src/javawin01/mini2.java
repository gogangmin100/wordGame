package javawin01;

import java.util.Random;
import java.util.Scanner;

public class mini2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 생성
		Random random = new Random(); // 랜덤 숫자를 생성하기 위한 Random 생성


		// 미리 저장된 10개의 영단어 목록
		String[] words = {"apple", "banana", "cherry", "kiwi", "lemon", "mango", "pear", "plum", "tomato", "egg"};

		String[] wrongword = new String[10]; // 틀린 단어 저장 

		int cnt = 0; // 틀린 갯수 카운팅

		int score = 0; // 총 점수를 저장할 변수 초기화 

		System.out.println("타자 연습 게임"); // 게임 시작 안내 출력
		System.out.println("엔터키를 누를시 게임 시작"); // 사용자가 엔터를 누르면 게임이 시작됨
		scanner.nextLine(); // 엔터 입력 대기

		// 총 10번의 게임 반복
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번 째 게임의 지시단어입니다."); // 현재 게임 횟수 출력

			// words 배열에서 랜덤한 단어를 선택하여 trywords 변수에 저장
			String trywords = words[random.nextInt(words.length)];
			System.out.println("\n영단어입력: " + trywords); // 사용자가 입력해야 할 단어 출력

			System.out.print("입력 :");
			String in = scanner.nextLine(); // 사용자가 입력한 단어를 변수 in에 저장


			// 입력한 단어와 지시된 단어가 정확히 일치하는지 비교
			if (in.equals(trywords)) {
				System.out.println("정답 10점");  
				score += 10; // 정답일 경우 10점 추가
				System.out.println("총점수: " + score);            
			} else {
				System.out.println("부분점수를 채점해 봅니다."); // 일부 정답 여부 확인


				// 복습기능
				for(int w = 0; w<10; w++) {

					if (wrongword[w] == null){   //빈공간에 저장
						wrongword[w] = trywords; 
						cnt++;
						break;

					}
				}
				if(cnt > 0) {
					System.out.println("\n복습할 단어 :");
					for(int k=0; k<cnt; k++) {
						System.out.println("-"+ wrongword[k]);
					}
				}


				// 입력된 단어와 정답 단어를 한 글자씩 비교하여 부분 점수 부여
				for (int j = 0; j < trywords.length() && j < in.length(); j++) {  
					// 단어의 같은 위치에 있는 문자가 일치하는지 확인
					if (trywords.charAt(j) == in.charAt(j)) {
						score += 1; // 일치하는 문자마다 1점 추가
						System.out.println(in.charAt(j) + "는 부분점수가 있습니다. 현재 점수: " + score);
					}
				}
			}

		}
		System.out.println("\n게임종료! 최종 점수: " + score + "점"); // 게임 종료 후 최종 점수 출력
	}
}


