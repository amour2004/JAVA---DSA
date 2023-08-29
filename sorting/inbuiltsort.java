import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort{
    public static void main(String[]args){
        Integer nums[] = {4,2,1,6,8,7};
        //Arrays.sort(nums,0,2);
        Arrays.sort(nums,Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}