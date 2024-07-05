package test;

public class 質數 {

	public static void main(String[] args) {

		int	num = 101;
		for(int i = 1;i < num;i++) {
			if(isprime(i)) {
				System.out.println(i + "是質數");
			} else {
				System.out.println(i + "不是質數");
			}
		}
	}

	public static boolean isprime(int num) {
		if (num <= 1) {
			return false;
		}

		for(int i = 2;i <= Math.sqrt(num);i ++) {
			if(num % i == 0 ) {
				return false;
			} 

		}
		return true;
	}
}



