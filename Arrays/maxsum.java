public class maxsum {
    public static void sarray(int numbers[]){
        int currentsum = 0 , maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                currentsum=0;
                for(int k = i; k<=j;k++){
                    currentsum += numbers[k];
                }
                if(currentsum>maxsum){
                    maxsum = currentsum;
                }
                System.out.println();
            }
        }
        System.out.println(maxsum);
        }
    
    public static void main(String args[]) {
        int numbers[] = { 2, 4 , 6, 8, 10};
        sarray(numbers);
    }
}
