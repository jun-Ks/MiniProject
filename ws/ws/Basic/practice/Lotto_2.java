package practice;

import java.util.Random;

public class Lotto_2 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int rand;
		int[] arr = new int[45];
		
		for(int i = 0; i < 45; i++) {
			arr[i] = rd.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

	}

}
