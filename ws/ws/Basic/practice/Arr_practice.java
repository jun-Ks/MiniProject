package practice;

import java.util.Random;

public class Arr_practice {

	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		Random rd = new Random();
		int rand, rand1;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <5; j++) {
				rand = rd.nextInt(3);
				rand1 = rd.nextInt(5);
				arr[rand][rand1] = 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
