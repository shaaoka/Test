package test;

import java.util.Scanner;

public class 計算機 {
	public static void main(String[] args) {
		/* 
		 * 思考需要什麼模組
		 * 輸入數字和符號的比較不能用 == 是比較記憶體位置，請用字串的比較.equals()
		 * 設計流程控制 if - else 或 switch - case 
		 * 被除數為0會發生錯誤
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入數字 1");		

		int n1 = scanner.nextInt();

		System.out.println("請輸入數字 2");

		int n2 = scanner.nextInt();

		System.out.println("請輸入 + 、 - 、 * 、 /");

		String operator = scanner.next();

		System.out.println(operator);

		//	switch - case 版本
		switch (operator) {
		case "+":
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case "-":
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case "*":
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;		
		case "/":
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		default:
			System.out.println("無效的運算符號");
		//	if - else 版本
		if(operator.equals("+")) {

			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

		} else if(operator.equals("-")) {

			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));

		} else if(operator.equals("*")) {

			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));

		} else if(operator.equals("/")) {
			
			if(n2 != 0){
			
				System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));				

			} else {

				System.out.println("被除數不能為0");
			}
		} else {

			System.out.println("請不要亂輸入");
		}
				scanner.close();
		}
	}
}
