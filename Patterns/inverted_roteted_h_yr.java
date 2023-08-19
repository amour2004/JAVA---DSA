public class inverted_roteted_h_yr {
    public static void py(int row){
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        py(5);
    }
}
