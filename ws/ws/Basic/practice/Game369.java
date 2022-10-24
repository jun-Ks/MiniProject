package practice;

public class Game369 {

	public static void main(String[] args) {
		int[] arr = new int[50];
		String s = "짝";
		for(int i = 1; i < 51; i++) {
			arr[i] = i;
			if(i == 3 || i == 6 || i == 9) {
				
				System.out.printf(s);
			}
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
				System.out.printf(s);
			}
			System.out.printf("%d  ", arr[i]);
			System.out.println();
		}
		

	}

}
