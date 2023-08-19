public class que_1 {
    public static void que(int numbers[]){
        boolean a = false;
        for(int i = 0;i<numbers.length-1;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                     a = true;
                }
                
            }
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,2};
        que(numbers);
        
    }
}
