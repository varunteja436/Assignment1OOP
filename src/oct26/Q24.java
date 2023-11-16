package oct26;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = kb.nextInt();
		
		if(num%2==0) {
			System.out.print("even");
		}else {
			System.out.print("odd");
		}
		int counter = 0;
		for(int i =1; i<= num ; i++) {
			if (num%i ==0) {
				counter++;
			}
		}
		if(counter==2) {
			System.out.print("prime");
		}else {
			System.out.print("not prime");
		}
	}

}
