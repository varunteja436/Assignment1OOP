package oct26;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number a:");
		double a = kb.nextDouble();
		System.out.print("Enter the number b:");
		double b = kb.nextDouble();
		System.out.print("Enter the number c:");
		double c = kb.nextDouble();

		double delta = (b *b) - 4* a*c;
		System.out.println(delta);
		quad(delta,b,a);
		
		
		
	}

	public static void quad(double delta, double b, double a) {

		if (delta > 0) {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.print("the root one is" + root1);
			System.out.println("the root two is" + root2);
		} else if (delta == 0) {
			double roots = -b / (2 * a);
			System.out.println("the one root is" + roots);
		} else {
			System.out.println("You dont have a root");
		}
	}

}
