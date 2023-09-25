public class SwapNumbers {
    public static void swapNumbers(int a , int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
    public static int Add1(int a){
        return -~a;

    }



    public static void main(String args[]){
        int a = 10;
        int b = 11;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // System.out.println(a+" "+b);
        // System.out.println(Add1(10));

        for(char ch = 'A';ch<='Z';ch++){
            System.out.println((char)(ch | ' '));
        }
    }
}
