public class reverse_an_Array{
    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length - 1;
        while(first<last){
            int temp = numbers[first];
            numbers[first] = numbers [last];
            numbers[last]  = temp;
            first ++;
            last --; 
        }
    }
    public static void main(String args[]){
        int numbers[] = { 12, 23, 11, 67, 56 , 45 ,78};
        reverse(numbers);
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}