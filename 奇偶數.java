package test;

import java.util.Scanner;

public class 奇偶數 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入數字 ?");
			int num = scanner.nextInt();
			if(num % 2 == 0) {
				System.out.println(num + "是偶數");
			} else {
				System.out.println(num + "是奇數");
			}
	}

}
