package oct26;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the actualprice :");
		double actualprice = kb.nextDouble();
		System.out.print("Enter the pamount :");
		double pamount = kb.nextDouble();
		
		double dis = (pamount/actualprice) * 100;
		System.out.print("discount i got "+ dis);
	}

}
