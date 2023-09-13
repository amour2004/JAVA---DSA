public class OdOrEven{
    public static void oddoreven(int num){
        int bitMask = 1;
        if((num & 1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
        int num = 7;
        oddoreven(num);
    } 
}
