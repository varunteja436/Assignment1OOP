package oct26;
import java.util.Scanner;
public class Q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (N): ");
        int N = scanner.nextInt();

        if (N < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;
            int i = 1;

            do {
                sum += i;
                i++;
            } while (i <= N);

            System.out.println("The sum of natural numbers from 1 to " + N + " is: " + sum);
        }

        scanner.close();

	}

}
