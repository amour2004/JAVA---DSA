public class maxSubarraySum2 {

    public static int maxsum(int numbers[]){
        int max = Integer.MIN_VALUE;
            int sum = 0;
            int prefix[] = new int[numbers.length];
            prefix[0] = numbers[0];
            for(int i = 1;i<numbers.length;i++){
                prefix[i] = prefix[i-1] + numbers[i];
            }

            for(int i = 0;i<numbers.length;i++){
                for(int j = i;j<numbers.length;j++){
                    sum = i==0 ? prefix[j]: prefix[j]-prefix[i-1];
                    if(sum>max){
                        max = sum;
                    }
                }
            }
            return max;
    }

    public static void main(String args[]){
        int numbers[] = {5,4,-1,7,8};
        System.out.println(maxsum(numbers));
    }
}
