package java04;

import java.util.Scanner;

public class CountDownPre {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("ī��Ʈ �ٿ�..");

		int x;

		do {
			System.out.print("���� ������:");
			x = stdIn.nextInt();

		} while (x <= 0);

		while (x >= 0)
			System.out.println(--x); // x���� ǥ���� �� ����
		System.out.println("x�� ����" + x + "�� �Ǿ���.");

	}

}
