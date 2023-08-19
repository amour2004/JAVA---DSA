public class Butterfly {
    public static void bfly(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i)+1;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=2*(i-1);k++){
                System.out.print(" ");
            }
            for(int l = 1;l<=(n-i)+1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]) {
        bfly(4);
    }
}
