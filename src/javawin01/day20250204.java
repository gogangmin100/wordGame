package javawin01;

import java.util.Scanner;

public class day20250204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			while(true) {
				System.out.println("이름을 입력하세요");
				String name = in.nextLine();
				System.out.println("입력하신 이름은" +name);
				System.out.println("입력하신 이름은" +name.length());
				System.out.println("나이를 입력하세요");
				int age = in.nextInt();
				System.out.println("입력하신 나이는" +age);
				System.out.println("취미를 입력하세요");
				String hobby = in.nextLine();
				System.out.println("취미로"+ hobby+"을 입력하셨습니다");
			}
		}

	}

