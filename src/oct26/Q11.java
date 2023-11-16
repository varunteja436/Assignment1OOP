package oct26;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number:");
		double num1 = kb.nextDouble();
		System.out.print("Enter the number 2:");
		double num2 = kb.nextDouble();
		System.out.print("Enter the number 3:");
		double num3 = kb.nextDouble();
		double largest;
		if(num1>=num2&&num1>=num3) {
			largest = num1;
		}else if(num2>=num1&&num2>=num3) {
			largest = num2;
		}else {
			largest = num3;
		}
		System.out.print("the largest number is:"+largest);
	}

}
