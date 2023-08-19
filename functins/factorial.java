public class factorial {
    public static int factorial(int x){
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }
    public static void main(String args[]){
        int a = 5;
        int c = factorial(a);
        System.out.println(c);
    }
}
