package oct26;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = kb.nextInt();
		if(num%4==0 && num%100 != 0 || num%400==0) {
			System.out.print("This year is a leap year");
		}else {
			System.out.print("this is not a leap year");
		}
	}

}
