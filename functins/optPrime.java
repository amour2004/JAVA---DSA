public class optPrime{
    public static boolean checkPrime(int n){
        boolean imPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                imPrime = false;
            }
    }
    return imPrime;
}
public static void primeInN(int x){
    for(int i = 2; i<=x;i++){
        if(checkPrime(i) == true){
            System.out.println(i);
        }
    }
}
    public static void main(String args[]) {
        primeInN(20);
    }
}