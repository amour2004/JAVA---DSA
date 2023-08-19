public class sumOfDigits {
    public static void sumOfD(int x){
        int a = 0;
        while(x>0){
           int rev = x % 10;
           a = a + rev;
           x = x / 10;
        }
        System.out.println(a);
    }
    public static void main(String args[]) {
        sumOfD(199);
    }
}
