import java.util.*;
public class creatingStrings {
    public static void letters(String str){
        for(int i = 0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
    //     String str = "Vishank";
    //     String str2 = new String("vishank");

    //     Scanner sc  = new Scanner(System.in);
    //     String name = sc.nextLine();
    //     System.out.println(name);
        String firstname = "vishank";
        String lastname = "Chauhan";
        String fullname = firstname+" "+lastname;
        // System.out.println(fullname+" is this");
        // System.out.println(fullname.charAt(0));
        letters(fullname);
    }
    
}
