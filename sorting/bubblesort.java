public class bubblesort {
    public static void bsort(int numbers[]) {
        for (int turn = 0; turn < numbers.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < numbers.length - 1 - turn; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 1, 6, 5, 4 };
        bsort(numbers);
    }
}
