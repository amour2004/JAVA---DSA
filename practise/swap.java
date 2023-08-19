public class swap {
    public static void swapping(int x,int y){
        int ref = x;
        x = y;
        y = ref;
        System.out.println(x+" "+y);
    }
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        swapping(a, b);
        
    }
}
