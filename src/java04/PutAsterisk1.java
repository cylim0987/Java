package java04;

import java.util.Scanner;

public class PutAsterisk1 {
//지정한 개수만큼 * 표시
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개의 *을 표시할건가?");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 0;
			while (i < n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}

	}

}
