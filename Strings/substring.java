public class substring {
    public static String ss(String str, int si,int ei){
        String ss = "";
        for(int i = si;i<=ei;i++){
           ss = ss + str.charAt(i);
        }
        return ss;
    }
    public static void main(String args[]){
        String str = "Hello world!";
        System.out.println(ss(str, 0, 3));
    }
}
