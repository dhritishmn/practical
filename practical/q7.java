/*07. To find the sum of any number of integers interactively, i.e., entering every number from the keyboard, whereas the total number of integers is given as a command line argument */

import java.util.Scanner;

public class InteractiveSum {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java InteractiveSum <num_integers>");
            System.exit(1);
        }

        int numIntegers = Integer.parseInt(args[0]);
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numIntegers; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            total += num;
        }

        System.out.println("The sum of the entered integers is: " + total);
    }
}
