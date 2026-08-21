public class search {
    public static void search1(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1; // Start at top-right corner
        
        
        while (row < matrix.length && col >= 0) {
            // Corrected '=' to '=='
            if (matrix[row][col] == key) {
                System.out.println("The element was found at: (" + row + ", " + col + ")");
                return; 
            }
            else if (key < matrix[row][col]) {
                col--; // Move left
            }
            else if (key > matrix[row][col]) {
                row++; // Move down
            }
        }
        System.out.println("Element not found in the matrix.");
    }

    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        search1(arr, 8);
    }
}