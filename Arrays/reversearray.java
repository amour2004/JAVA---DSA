public class reversearray {
    public static void revarray(int numbers[]){
        int start = 0 , end = numbers.length - 1;
        while(start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[] = {10, 14, 16 ,19, 22, 27 };
        revarray(numbers);
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
