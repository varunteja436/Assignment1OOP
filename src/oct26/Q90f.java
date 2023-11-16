package oct26;

import java.util.Scanner;
public class Q90f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of lines (odd number): ");
		        int lines = scanner.nextInt();

		        
		        if (lines % 2 == 0) {
		            System.out.println("Please enter an odd number.");
		        } else {
		            System.out.println("Pattern:");

		            for (int i = 1; i <= lines; i++) {
		                for (int j = i; j >= 1; j--) {
		                    System.out.print(j);
		                }
		                System.out.println();
		            }

		          
		            for (int i = lines - 1; i >= 1; i--) {
		                for (int j = i; j >= 1; j--) {
		                    System.out.print(j);
		                }
		                System.out.println();
		            }
		        }

		       
		    }
		}