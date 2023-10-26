package oct26;
//prime number check
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = kb.nextInt();
	
		if(num==1||num==2) {
			System.out.print("the num is prime:");
		}else {
			for(int i= 2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.print("the num is not prime:");
				}else {
					System.out.print("the num is prime:");
					return;
				}
				kb.close();
			}
		}
	}
}
