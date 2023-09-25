public class beautifulArray {
    public long minimumPossibleSum(int n, int target) {
        int nums[] = new int[n];
        int sum = 0 ;
        nums[1] = 1;
     for(int i = 1;i<n;i++){
        nums[i] = nums[i] + 1;
        sum = sum + nums[i];
        for(int j = i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
                nums[i] = nums[i] + 1;
                sum = sum + nums[i];
            } 

        }
     }
     return sum;   
    }
}
