package java04;

import java.util.Scanner;

public class SignRepeat {
//읽은 정수값의 부호를 판정해서 표시(원하는 만큼 반복)
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int retry;

		do {

			System.out.print("정수값 : ");
			int x = stdIn.nextInt();

			if (x > 0) {
				System.out.println("이 값은 양수다.");
			} else if (x < 0) {
				System.out.println("이 값은 음수다.");
			} else {
				System.out.println("0을 입력하였다.");
			}

			System.out.println("다시 한 번 할 건가? 예-1 / 아니오-2");
			retry = stdIn.nextInt();
		} while (retry == 1);

	}

}
