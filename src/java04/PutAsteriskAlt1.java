package java04;

import java.util.Scanner;

public class PutAsteriskAlt1 {
//���� ������ŭ *�� +�� ����� ǥ��
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� ���� ǥ���ұ��? : ");
		int x = stdIn.nextInt();
		if (x > 0) {
			int i = 0;
			while(i < x){
				if(i % 2 == 0) {  //i�� ¦���� '*'�� ���
					System.out.print("*");
				}else {  //i�� Ȧ���� '+'�� ���
					System.out.print("+");
				}
				i++;
				
			}
			System.out.println();
		}
		
	}

}
