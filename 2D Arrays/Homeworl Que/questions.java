public class questions {
    public static int seaerchsev(int mat[][]){
        int help = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==7){
                    help++;
                }
            }
        }
        return help;
    }    

    public static int sOSR(int mat[][]){
        int sum = 0,col = 0;
        while(col<=mat.length){
            sum += mat[1][col];
            col++;
        }
        return sum;
    }
    public static void transpose(int mat[][]){
        for(int i = 0;i<mat[0].length;i++){
            for(int j = 0;j<mat.length;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[][] = { {4,7,8},{8,8,7} };
        transpose(arr);
    }
}
