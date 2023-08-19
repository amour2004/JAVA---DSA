public class rhombus {
    public static void rbus(int n){
        for(int k = 1;k<=n;k++){
            for(int i = 1;i<=(n-k);i++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void main(String args[]){
        rbus(5);
    }
}