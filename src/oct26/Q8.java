package oct26;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number:");
		double num = kb.nextDouble();
		if(num<0) {
			System.out.print("I cant do it");
		}else {
			double sqroornum = Math.sqrt(num);
			System.out.print("the sqr is:"+Math.sqrt(num));
		}
			

	}

}
