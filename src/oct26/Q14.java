package oct26;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a 1st string:");
		String  y = kb.next();
		System.out.print("Enter a 2nd string:");
		String  z = kb.next();
		if(y.equals(z)) {
			System.out.print("the 2 strings are equal");
		}else {
			System.out.print("they are not same strings");
		}
	}
}
