public class maxSubarraySum {

    public static void maxSubarray(int numbers[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                int sum = 0;
                for(int k = i;k<j;k++){
                    sum = sum + numbers[k];
                    if(sum>max){
                        max= sum;
                    }
            }
        }
    }
    System.out.print(max);
}

    public static void main(String[]args){
        int numbers[] = {1,-2,6,-1,3};
        maxSubarray(numbers);

    }
}
