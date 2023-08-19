public class BtoD {
    public static void binaryToDecimal(int x){
        int n = 0,dec = 0;
        while(x>0){
            int lastdigit = x % 10;
            dec = dec + lastdigit* (int)Math.pow(2,n);
            n++;
            x = x / 10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
    binaryToDecimal(1111);
    }
}
