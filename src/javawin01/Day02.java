package javawin01;

public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 열수와 철수는 각각 기본 점수100점이다
		int pointyoungsu=100; // a는영수 int = 자료형, 카멜 표기법
		int pointchulsu=100; // b는 철수
		// 철수가 두번이겼다
		pointchulsu=pointchulsu+10;
		pointyoungsu=pointyoungsu-10;
		pointchulsu=pointchulsu+10;
		pointyoungsu=pointyoungsu-10;
		//비겼다
		pointchulsu=pointchulsu+2;
		pointyoungsu=pointyoungsu+2;
		//영수가한번이겼다
		pointyoungsu=pointyoungsu+10;
		pointchulsu=pointchulsu-10;
		//최종점수
		System.out.println("영수의 점수"+pointyoungsu);
		System.out.println("철수의 점수"+pointchulsu);
	}
}
