/*5. To convert a decimal to binary number */
import java.util.Scanner;

public class clgQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        
        System.out.println("Binary equivalent: " + binary);
          input.close();
    }
}
