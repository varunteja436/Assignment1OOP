package oct26;
import java.util.Scanner;
public class Q5 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number:");
		double num = kb.nextDouble();
		double absnum;
		if(num<0) {
			absnum = (-1)* num;
			
		}
		else {
			absnum=num;
		}
		System.out.print("the abs numis:"+ absnum);
		kb.close();
	}
	

}
