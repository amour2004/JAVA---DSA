import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean imPrime = true;
        for(int i = 2;i<=(n-1);i++){
            if(n % i == 0){
                imPrime = false;
            }
        }
        if(imPrime==true){
            System.out.println("Given number is prime");
        }
        else{
            System.out.println("Given number is not prime");
        }
    }
}