package java04;

import java.util.Scanner;

public class CountDownPre {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트 다운..");

		int x;

		do {
			System.out.print("양의 정수값:");
			x = stdIn.nextInt();

		} while (x <= 0);

		while (x >= 0)
			System.out.println(--x); // x값을 표시한 후 감소
		System.out.println("x의 값이" + x + "이 되었음.");

	}

}
