package java04;

import java.util.Scanner;

public class PutAsteriskAlt2 {
//���� ������ŭ *�� +�� ����� ǥ��(���2)
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� ���� ǥ���ұ��? : ");
		int x = stdIn.nextInt();
		if (x > 0) {
			int i = 0;
			while (i < x / 2) {
				System.out.print("*+");
				i++;
			}

		}
		if (x % 2 == 1) {
			System.out.println("*");
		}
		System.out.println();

	}

}
