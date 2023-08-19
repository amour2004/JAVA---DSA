public class evencheck {
    public static void even(int x){
        int b = x % 2;
        boolean a = false;
        if(b==0){
            a = true;
        }
        else{
            a = false;
        }
        System.out.println(a);
    }
    public static void main(String args[]) {
        even(16);
    }
}
