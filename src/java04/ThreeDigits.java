package java04;

import java.util.Scanner;

public class ThreeDigits {
//3자리의 양의 정수값 읽기
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x; //읽는 값
		
		do {
			System.out.println("세 자리의 정수값: ");
			x = stdIn.nextInt();
		}while (x < 100 || x > 999);
		System.out.println("입력한 값은 " + x + "이다.");
	}

}
