import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    public static void main(String args[]){
        Integer numbers[] = {2,4,1,5,3};
        //Arrays.sort(numbers);
        Arrays.sort(numbers,0,3); 
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        //For descending order
        Integer array[] = {2,4,1,5,3};
        Arrays.sort(array,Collections.reverseOrder());
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
    }
}
