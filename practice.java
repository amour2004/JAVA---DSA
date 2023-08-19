public class practice {
    public static void printarray(int array[]){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void bubblesort(int array[]){
        for(int i = 0;i<array.length-1;i++){
            int turn = i;
            for(int j = 0;j<array.length-1-turn;j++){
             
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void selectionsort(int array[]){
        for(int i = 0;i<array.length-1;i++){
            int minvalue = i;
            for(int j = i+1;j<array.length;j++){
                if(array[minvalue]>array[j]){
                    minvalue = j;
                }
            }
            int temp = array[minvalue];
            array[minvalue] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String args[]){
        int array[]  = {3,6,2,1,8,7,4,5,3,1};
        selectionsort(array);
        printarray(array);
    }
}
