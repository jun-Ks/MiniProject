package practice;

import java.util.Random;

public class Dice2 {

	public static void main(String[] args) {
		Random rd = new Random();
		int rand, rand2;
		int[] dice_1 = new int [6];
		int[] dice_2 = new int [6];
		
		for(int i = 0; i < 6; i++) {
			rand = rd.nextInt(6)+1;
			rand2 = rd.nextInt(6)+1;
			dice_1[i] = rand;
			dice_2[i] = rand2;
			for(int j = 0; j < i; j++) {
				if(dice_1[i] == dice_1[j]) {
					i--;
				}
				if(dice_2[i] == dice_2[j]) {
					i--;
				}
			}
			
		}
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				
			
				if(dice_1[i] + dice_2[j] == 6) {
					System.out.printf("(%d, %d) ", dice_1[i], dice_2[j]);
				}
			}
			
		}
		

	}

}
