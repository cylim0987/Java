package java04;

import java.util.Scanner;

public class EnumScope2 {
//2개의 정수값을 읽어서 두 정수 사이에 있는 모든 정수값 작은 것부터 큰 순으로 표시.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수 A : ");
		int x = stdIn.nextInt();
		
		System.out.print("정수 B : ");
		int y = stdIn.nextInt();
		
		if(x>y) {
			int t = x;
			x = y;
			y = t;
		}
//		do {
//			System.out.print(x + " ");
//			x = x + 1;
//			
//		}while(x <= y);
//		System.out.println();
		
		do {
			System.out.print((x++) + " ");
		}while(x <= y);
		System.out.println();
		
		
	}
}
