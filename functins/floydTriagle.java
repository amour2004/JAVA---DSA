public class floydTriagle {
    public static void FloydTriagle(int n){
        int m = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        FloydTriagle(4);
    }
}
