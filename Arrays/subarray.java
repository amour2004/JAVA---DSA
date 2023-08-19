public class subarray {
    public static void sarray(int numbers[]){
        int currentsum = 0 , maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                for(int k = i; k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            
        }
        }
    
    public static void main(String args[]) {
        int numbers[] = { 2, 3 , 4, 5, 6};
        sarray(numbers);
    }
}
