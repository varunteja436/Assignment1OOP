package oct26;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me a number:");
		int N = kb.nextInt();
		int sum = 0;
		int counter = 1;
		while(counter <= N) {
			sum = sum + counter;
			counter++;
		}
		System.out.println("the sum is:" + sum);
	}

}
