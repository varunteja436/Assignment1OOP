package oct26;

import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me a base number:");
		int bs = kb.nextInt();
		
		int fnum = 1;
		int count = 1;

		while (count<=bs) {
			fnum =  bs * bs;
			count++;
			
		
		} System.out.println(" the given number square is:" + fnum);

		
	}

}
