package test;

public class 陣列中尋找最小值和最大值 {


	public static void main(String[] args) {

		int[] list = {4,2,1,9};
		// 尋找最小值
		int min = list[0];
		for(int i = 0;i < list.length;i++) {
			if(list[i] < min) {
				min = list[i];
			}
		}

		// 尋找最大值
		int max = list[0];
		for(int i = 0;i < list.length;i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		System.out.println("陣列中最小值:"+ min);
		System.out.println("陣列中最大值:"+ max);
	}
}