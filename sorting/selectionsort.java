public class selectionsort {
    public static void ssort(int numbers[]){
        for(int i = 0;i<numbers.length-1;i++){
            int minvalue = i;
            for(int j = i + 1 ;j<numbers.length;j++){
                if(numbers[minvalue]<numbers[j]){
                    minvalue = j;
                }
                int temp = numbers[minvalue];
                numbers[minvalue] = numbers[j];
                numbers[j] = temp;
            }
        }
        for(int k = 0 ;k<numbers.length;k++){
            System.out.print(numbers[k]+" ");
        }
    }
    public static void main(String args[]){
        int numbers[] = { 5 , 3, 1, 2, 4};
        ssort(numbers);
    }
}
