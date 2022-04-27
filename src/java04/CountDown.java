package java04;

import java.util.Scanner;

public class CountDown {
//양의 정수값을 0까지 카운트다운
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운. ");
		int a;
		
		do {
			System.out.println("양의 정수값 : ");
			a = stdIn.nextInt();
		}while(a <= 0);
		
		while(a >= 0)
			System.out.println(--a);
			System.out.println("x의 값이" + a + "이 되었다.");
	}

}
