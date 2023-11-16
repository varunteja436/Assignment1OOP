package oct26;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me a bs:");
		int bs = kb.nextInt();
		System.out.println("Give me a exp:");
		int exp = kb.nextInt();
		int exp1 = exp;
		int pow = 1;

		while (exp > 0) {
			pow = pow * bs;
			--exp;
		}
		System.out.println("the base number is " + bs + " the power is " + exp1 + " the final result id " + pow);
	}

}
