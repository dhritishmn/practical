/*13. Write a program to show the use of static functions and to pass variable length arguments in
a function*/

public class staticfnex {
  
    
    public static int findMax(int... numbers) {
      int max = Integer.MIN_VALUE;
      for (int num : numbers) {
        if (num > max) {
          max = num;
        }
      }
      return max;
    }
    
    
    public static double findAverage(int... numbers) {
      int sum = 0;
      for (int num : numbers) {
        sum += num;
      }
      return (double) sum / numbers.length;
    }
    
    public static void main(String[] args) {
      int max = findMax(3, 7, 1, 9, 2);
      double average = findAverage(4, 8, 2, 5);
      
      System.out.println("Max value: " + max);
      System.out.println("Average value: " + average);
    }
  }
  