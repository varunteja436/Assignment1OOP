package oct26;

import java.util.Scanner;

public class Q90c {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int line = kb.nextInt();
		for(int i = 0;i< line;i++) {
			for(int j =0;j<i;j++) {
				System.out.println(" ");
			}
			for(int k =0;k<line;k++) {
				System.out.print("* ");
				
			}System.out.println();
		}kb.close();
	}

}
