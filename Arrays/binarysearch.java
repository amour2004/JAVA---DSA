public class binarysearch {
    public static int bsearch(int numbers[],int key){
        int start = 0; int end = numbers.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if (numbers[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {9, 10, 23, 29, 34, 67, 89};
        int key = 29;
        System.out.println(bsearch(numbers, 29));
    }
}
