import java.util.Scanner;

public class helloworld {
    public static void hlworld(){
        System.out.println("hello world!");
    }
    public static int sum(int a , int b){
        int sum = a + b ;
        return sum;
    }

    public static void change(int a, int b){
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int factorial(int x){
        int factoriall = 1;
        for(int i = 1; i<=x; i++){
            factoriall = factoriall * i;
        }
        return factoriall;
    }

    public static int comb(int n, int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n-r);

        int c = nfact/(rfact*nrfact);
        return c;
    }
    
    public static boolean checkprime(int x){
        boolean cp = true;
        for(int i = 2; i<x;i++){
            if(x%i==0){
                cp = false;
            }
        }
        return cp;
    }

    public static void prime(int x){
        for(int i = 2; i<=x;i++){
            if(checkprime(i)==true){
                System.out.println(i);
            }
        }
    }

    public static void binarytodecimal(int x){
        int pow = 0;
        int dec = 0;
        while(x>0){
            int lastdig =  x % 10;
            dec = dec + lastdig  * (int)Math.pow(2,pow);
            pow++;
            x = x / 10;
        }
        System.out.println(dec);
    }

    public static void decimaltobinary(int x){
        while(x>0){
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binarytodecimal(n);
    }
}
