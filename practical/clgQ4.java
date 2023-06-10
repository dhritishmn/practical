/*4. To learn use of .length in case of a two dimensional array */
public class clgQ4 {
    public static void main(String[] args) {
      // Create a 2D array with 3 rows and 4 columns
      int[][] arr = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
      };
      
      // Print the number of rows and columns using .length
      System.out.println("Number of rows: " + arr.length);
      System.out.println("Number of columns in first row: " + arr[0].length);
      
      // Iterate over the array and print each element
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
  
