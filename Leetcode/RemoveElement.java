public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==val){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,4,5,6,2,2};
        
    }
}
