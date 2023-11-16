package oct26;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = kb.nextInt();
		System.out.print("Enter the number :");
		int num2 = kb.nextInt();
		
		if(num%3==0 && num2%5==0) {
			System.out.print("yes :");
		}else {
			System.out.print("no");
		}
	}

}
