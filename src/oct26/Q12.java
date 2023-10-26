package oct26;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a letter:");
		char  y = kb.next().charAt(0);
		char lowmychar=Character.toLowerCase(y);
		if(lowmychar=='a'||lowmychar=='e'||lowmychar=='i'||lowmychar=='o'||lowmychar=='u') {
			System.out.print("It is vowel");
		}else {
			System.out.print("It is consonant");
		}
	}

}
