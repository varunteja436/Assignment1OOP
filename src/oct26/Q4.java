package oct26;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = kb.nextInt();
		if(num<0) {
			System.out.print("Cant do negative number");
			
		}else {
			int fact = 1;
			 for(int i=1;i<=num;i++) {
				 fact=fact*i;
			 }
			 System.out.print("The factorial is :"+ fact);
				 
		}
			kb.close();
	}

}
