public class searchMatrix {
    public static boolean smatrix(int matrix[][],int target){

        //Brute force approch
        // for(int i = 0;i<matrix.length;i++){
        //     for(int j = 0;j<matrix[0].length;j++){
        //         if(target==matrix[i][j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        //Staircase search
        int row = 0, col = matrix[0].length-1;
        while(row <matrix.length && col>=0 ){
            if(target == matrix[row][col]){
                return true;
            }
            else if(target > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(smatrix(matrix, 60));
    }
}
