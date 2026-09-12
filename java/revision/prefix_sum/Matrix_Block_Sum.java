package revision.prefix_sum;

public class Matrix_Block_Sum {

    public static void main(String[] args) {

        int[][] arr = {
                       {1,2,3},
                       {4,5,6},
                       {7,8,9}
                        };

        int k = 1;

        

    }

    public static int[][] matrixsum(int[][] mat, int k) {

        // Number of rows and columns
        int m = mat.length;
        int n = mat[0].length;

        // Extra row and column of 0s
        // makes prefix-sum boundary calculations easier
        int[][] prefix = new int[m + 1][n + 1];

        // Build the 2D Prefix Sum
        // prefix[i][j] = sum from top-left to current cell
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                prefix[i][j] =
                        mat[i - 1][j - 1]       // current element
                        + prefix[i - 1][j]      // top
                        + prefix[i][j - 1]      // left
                        - prefix[i - 1][j - 1];// remove overlapping area
            }
        }

        // Store the block sum for every cell
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Find block boundaries in the original matrix
                int r1 = Math.max(0, i - k);       // top
                int r2 = Math.min(m - 1, i + k);   // bottom
                int c1 = Math.max(0, j - k);       // left
                int c2 = Math.min(n - 1, j + k);   // right

                // Prefix matrix has one extra row and column,
                // so shift all coordinates by 1
                r1++;
                r2++;
                c1++;
                c2++;

                // Rectangle Sum Formula:
                //
                // Big Rectangle
                // - Top unwanted area
                // - Left unwanted area
                // + Overlapping area
                //
                // BR - TR - BL + TL
                result[i][j] =
                        prefix[r2][c2]              // Big rectangle
                        - prefix[r1 - 1][c2]        // Remove top
                        - prefix[r2][c1 - 1]        // Remove left
                        + prefix[r1 - 1][c1 - 1];   // Add overlap back
            }
        }

        return result;
    }
}