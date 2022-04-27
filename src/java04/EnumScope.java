package java04;

import java.util.Scanner;

public class EnumScope {
//2개의 정수값을 읽어서 두 정수 사이에 있는 모든 정수값 작은 것부터 큰 순으로 표시.
//ㄸ
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수 A : ");
		int x = stdIn.nextInt();
		
		System.out.print("정수 B : ");
		int y = stdIn.nextInt();
		
//		x를 ++반복. y값과 같아질 때까지. 그러고 그걸 출력.
		do {
			if(x < y) {
				x++;
			}else if(x > y) {
				y++;
			}
			
		}while(x == y);
			System.out.println("출력 종료.");
	}

}
