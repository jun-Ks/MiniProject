package practice;

import java.util.Random;
import java.util.Scanner;

public class Bingo2 {
	
	public static void main(String[] args) {
		int[] arr1 = new int[25];
		int[][] arr2 = new int[5][5];
		Random rd = new Random();
		int n = 0;
		int cnt = 0;
		int rand;
		int innum;
		int bingocnt = 0;
		int bingoline = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 25; i++) {
			rand = rd.nextInt(25)+1;
			arr1[i] = rand;
			for(int j = 0; j < i; j++) {
				if(arr1[i] == arr1[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr2[i][j] = arr1[n];
				n++;
			}
		}
		
		do { 
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.printf("%d ", arr2[i][j]);
				}
				System.out.println();
			}
					
			System.out.println("숫자를 입력해주세요. >");
			innum = sc.nextInt();
			
			for(int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if(arr2[i][j] == innum) {
						arr2[i][j] = 0;
						
					}
					System.out.printf("%d ", arr2[i][j]);
				}
				System.out.println();
			}
			
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(arr2[i][j] == 0) {
						cnt++;
						if(cnt == 5) {
							bingocnt++;
						}
					}
				}
				
			}
			 
			System.out.printf("%d", bingocnt);
			System.out.println();
			
		}while(bingocnt == 3);
	}

}
