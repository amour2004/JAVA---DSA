public class inverted_half_py {
    public static void inverted_nump(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n+1)-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_nump(5);
    }
}
