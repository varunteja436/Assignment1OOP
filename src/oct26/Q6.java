package oct26;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the numberv a:");
		double a = kb.nextDouble();
		System.out.print("Enter the number b :");
		double b = kb.nextDouble();
	double temp;
	System.out.println("before swapping a:"+a);
	System.out.println("before swap b is:"+b);

	temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping a:"+a);
	System.out.print("After swap b is:"+b);
	kb.close();
	}

}
