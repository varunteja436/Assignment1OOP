package oct26;

import java.util.Scanner;
public class Q90e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of lines: ");
		        int lines = scanner.nextInt();

		        System.out.println("Pattern:");

		        int count = 1;

		        for (int i = 1; i <= lines; i++) {
		           
		            for (int j = 1; j <= i; j++) {
		                System.out.print(count + " ");
		                count++;
		            }

		            System.out.println();
		        }

		        scanner.close();
		    }
		}