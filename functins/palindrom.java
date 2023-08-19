import java.util.*;
public class palindrom {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in); 
       int num = sc.nextInt();
       int rem,rev=0;
       int temp = num;
       while(temp>0){
        rem = temp % 10;
        rev = rev*10 +rem; 
        temp = temp / 10;
       }
       if(num == rev){
        System.out.println("It is palindromic number");
       }
       else{
        System.out.println("It is not palindromic number");
       }
    }
}
