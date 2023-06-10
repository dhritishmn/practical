/*3. To learn use of single dimensional array by defining the array dynamically */
import java.util.Scanner;

public class clgQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];  
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("The array contains:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
         input.close();
    }
}

