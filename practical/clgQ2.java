/* 2. To find the factorial of a given number
 */
import java.util.Scanner;

public class clgQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        long fact = 1;  

        for (int i = 1; i <= num; i++) {
            fact *= i; 
        }

        System.out.println("The factorial of " + num + " is " + fact);

        input.close();
    }
}

