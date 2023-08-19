public class p2 {
    public static void p3(int n){
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
    public static void main(String args[]){
        p3(4);
    }
}
