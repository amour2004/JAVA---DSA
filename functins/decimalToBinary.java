public class decimalToBinary {
    public static void reverse(int n){
        while(n>0){
            int reverse = n % 10;
            n = n / 10;
            System.out.print(reverse);
        }
    }
    public static void decToBin(int x){
        int pow = 0;
        int bitno = 0;
        while(x>0){
           int remider = x % 2;
           bitno = bitno + remider *(int) Math.pow(10, pow);
           pow++;
           x = x / 2;
        }  
        System.out.print(bitno);
    }
    public static void main(String args[]) {
       decToBin(18);
    }
}
