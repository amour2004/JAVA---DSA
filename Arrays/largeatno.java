public class largeatno {
    // public static int largeNo(int numbers[]){
    //     int a = numbers[0];
    //     for( int i = 0;i<numbers.length;i++){
            
    //         if(numbers[i]>a){
    //             a = numbers[i];
    //         }
    //     }
    //     return a;
    public static int largeNo(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static void main(String args[]){
        int numbers[] = { 12, 16, 9, 55, 88, 2};
        int a = largeNo(numbers);
        System.out.println(a);
    }
}
