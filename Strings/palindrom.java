import java.util.*;
public class palindrom {
    public static boolean Palindrom(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         int last = str.length()-1;
        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(last)){
            return false;
            }
            last--;
        }
        return true;
    }
    public static void main(String args[]){
        String st = "Naman Naman";
        System.out.println(Palindrom(st));
    }
}
