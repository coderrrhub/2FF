package Lecture16;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = transpose(mat);
    }

    // Time complexity: O(n*m)
    // Space complexity: O(n*m) for the output matrix.
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] trans = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                trans[i][j] = matrix[j][i];
            }
        }

        return trans;
    }

    // Follow-up for square matrices: without using extra space change in the same array
    // Time complexity: O(n*m)
    // Space complexity: O(1)
    public static int[][] transpose1(int[][] matrix) {
        int n = matrix.length;
        
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        return matrix;
    }

}
