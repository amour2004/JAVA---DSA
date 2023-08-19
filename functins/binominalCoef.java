import java.util.*;
import java.math.*;
public class binominalCoef {
    public static int bc(int n,int r){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        int factorialt = 1;
        for (int j = 1; j <= r; j++) {
            factorialt = factorialt * j;
        }
        int z = n - r;
        int factorialy = 1;
        for (int k = 1; k <= z; k++) {
            factorialy = factorialy * k;
        }
        return (factorial / (factorialt * factorialy));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bc(n, r));
    }
}