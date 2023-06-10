/*1. To find the sum of any number of integers entered as command line arguments
 */
public class clgQ1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
