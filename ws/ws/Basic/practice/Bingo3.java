package practice;

import java.util.Random;
import java.util.Scanner;

public class Bingo3 {

	public static void main(String[] args) {
		int[] arr1 = new int[25];
		int[][] arr2 = new int[5][5];
		Random rd = new Random();
		int n = 0;
		int cnt = 0;
		int rand;
		int in_num=0;
		int bingocnt = 0;
		int bingoline = 0;
		int n1 = 1;
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
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}
		
		while(bingocnt <= 3){ 
			
			System.out.println("숫자를 입력해주세요. >");
			in_num = sc.nextInt();
			bingocnt = 0;
			cnt = 0;
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(arr2[i][j] == in_num) {
						arr2[i][j] = 0;
					}
					System.out.printf("%3d", arr2[i][j]);
				}
				System.out.println();
			}
			for(int i = 0; i < 5; i++) { //가로
				for(int j = 0; j < 5; j++) {
					if(arr2[i][j] == 0) {
						cnt++;
						if(cnt == 5) {
							bingocnt++;
							System.out.println("bingocnt : "+bingocnt);
						}	
					}
				}
			cnt = 0;
			}
			for(int i = 0; i < 5; i++) { //세
				for(int j = 0; j< 5; j++) {
					if(arr2[j][i] == 0) {
						cnt++;
						if(cnt==5) {
							bingocnt++;
							System.out.println("bingocnt : "+bingocnt);
						}
					}
				}
			cnt = 0;
			}
			for(int i = 0; i <5; i++) {
				if(arr2[i][i] == 0) {
					cnt++;
					if(cnt == 5) {
						bingocnt++;
						System.out.println("bingocnt : "+bingocnt);
					}
				}
			
			}
			cnt = 0;
			for(int j =4; j >= 0; j--) {
				if(arr2[4-j][j] == 0) {
					cnt++;
				
					if(cnt == 5) {
						bingocnt++;
						System.out.println("bingocnt :"+bingocnt);
					}
				}
			}
			cnt = 0;
		}
		
	}

}
