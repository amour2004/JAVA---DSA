public class insertionsort {
    public static void isort(int numbers[]){
        for(int i = 1;i<numbers.length;i++){
            int current = numbers[i];
            int prev = i - 1;
            while(prev >=0 && numbers[prev]>current){
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            numbers[prev+1] = current;
        }
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String args[]){
        int numbers[] = { 11,3 ,6, 2, 1, 7};
        isort(numbers);
    }
}
