package oct26;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number :");
		double num = kb.nextDouble();
		
		if(num>0 && num%2 == 0) {
			
			System.out.print("positive:");
		}else {
			System.out.print("Negative");
		}
	}

}
