public class diamond {
    public static void demon(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            for(int l = 1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            for(int l = 1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        demon(4);
    }
}
