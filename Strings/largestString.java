public class largestString {
    public static void Largeststring(String str[]){
        String largest = str[0];
        for(int i = 1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        String str[] ={"apple" , "banana" , "mango","ananas","kiwi"}; 
        Largeststring(str);
    }
}
