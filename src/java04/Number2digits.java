package java04;

import java.util.Random;
import java.util.Scanner;

public class Number2digits {
//숫자 맞추기 게임 . 2자리의 정수값(10~99)을 맞추는. 난수 생성, if문, do문
	public static void main(String[] args) {

		Random rand = new Random();
		int x = rand.nextInt(99); //

		System.out.println("숫자 맞추기 게임을...1부터 99까지 맞춰보라");
		System.out.println("난수값은 얼마인가?(체크용) " + x);

		Scanner stdIn = new Scanner(System.in);

		System.out.print("숫자입력 :");
		int y; // do 아래

		do {
			y = stdIn.nextInt(); // do 위

			if (y > x) {
				System.out.println("입력한 값이 난수값보다 크다");
			} else if (y < x) {
				System.out.println("입력한 값이 난수값보다 작다");
			}

			// y값(입력값) 과 x값(난수)가 일치하지 않으면 반복.
		} while (y != x); //x, y값이 같지 않으면 do문 반복. x와 y값이 서로 같으면 do문은 종료
		System.out.println("정답. 문제 끝.");

	}

}
