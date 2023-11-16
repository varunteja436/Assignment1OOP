package oct26;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me a number:");
		int Num = kb.nextInt();
		int revnum = 0;
		
		while(Num != 0) {
			int d = Num%10;
			revnum = revnum * 10 +d;
			Num =Num /10;
		}
		System.out.println(revnum);
		
	}

}
