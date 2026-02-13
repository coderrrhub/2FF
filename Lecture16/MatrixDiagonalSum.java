package Lecture16;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = diagonal(arr);
        int sum1 = diagonalSum(arr);
        System.out.println(sum+"  "+sum1);
    }

    // T.C.:- O(N*N)
    public static int diagonal(int[][] mat) {
		int sum = 0;
		for(int row = 0; row < mat.length; row++) {
			for(int col = 0; col < mat[0].length; col++) {
				if((row == col) || (row + col == mat.length-1)) {
					sum = sum + mat[row][col];
				}
			}
		}
		
		return sum;
	}

    // T.C.:- O(N)
    public static int diagonalSum(int[][] mat) {
      int sum=0;
        int m=mat.length; // for diagonal same row and column number
        for(int i=0;i<m;i++)
        {
            sum+=mat[i][i];  // it is for 1, 5 and 9 (i.e. both row and column number same)
        }
        
        int len=m-1;
        for(int i=0;i<m;i++)
        { 
            if(i!=(len))              // for preventing duplicate part i.e. 5
                sum+=mat[i][len];
            
            len--;
        }
        return sum;
    }
}
