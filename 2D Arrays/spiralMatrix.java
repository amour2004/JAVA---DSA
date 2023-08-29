public class spiralMatrix {
    public static void smatrix(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        while (startcol <= endcol && startrow <= endrow) {
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            startrow++;
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(matrix[i][endcol]+ " ");
            }
            endcol--;
            if(startrow<=endrow){
                for (int j = endcol; j >= startcol; j--) {
                System.out.print(matrix[endrow][j]+ " ");
            }
            }
            endrow--;
            if(startcol<=endcol){
                for (int i = endrow; i >= startrow; i--) {
                System.out.print(matrix[i][startcol]+ " ");
            }
            }
            startcol++;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        smatrix(matrix);
    }
}
