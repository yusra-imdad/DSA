public class Boundary {

  // Method to print boundaries of the array
  public static void extractBoundaries(int arr[][]) {
      int rows = arr.length;
      int cols = arr[0].length;

      System.out.println("Boundaries of the array:");

      // Print the first row
      for (int i = 0; i < cols; i++) {
          System.out.print(arr[0][i] + " ");
      }
      System.out.println();

      // Print the first and last columns of the middle rows
      for (int i = 1; i < rows - 1; i++) {
          System.out.print(arr[i][0] + " ");  // First column
          for (int j = 1; j < cols - 1; j++) {
              System.out.print("  ");  // Empty space for inner elements
          }
          System.out.print(arr[i][cols - 1]);  // Last column
          System.out.println();
      }

      // Print the last row
      for (int i = 0; i < cols; i++) {
          System.out.print(arr[rows - 1][i] + " ");
      }
      System.out.println();
  }

  // Method to print the center part of the array
  public static void cropCenterPart(int arr[][]) {
      int rows = arr.length;
      int cols = arr[0].length;

      System.out.println("Center part of the array:");

      // Print the center part (everything except the boundaries)
      for (int i = 1; i < rows - 1; i++) {
          for (int j = 1; j < cols - 1; j++) {
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
  }

  public static void main(String[] args) {
      // Example 2D array
      int[][] arr = {
          { 1, 2, 3, 4 },
          { 5, 6, 7, 8 },
          { 9, 10, 11, 12 },
          { 13, 14, 15, 16 }
      };

      // Call the methods
      extractBoundaries(arr);
      cropCenterPart(arr);
  }
}
