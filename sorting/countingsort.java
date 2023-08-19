public class countingsort {
    public static void printarray(int array[]){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void countsort(int array[]){
        int maxvalue = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;i++){
            maxvalue = Math.max(maxvalue, array[i]);
        }
        int count[] = new int[maxvalue+1];
        for(int i = 0;i<array.length;i++){
            count[array[i]] = count[array[i]] + 1;
        }
        int j = 0;
        for(int i = 0;i<count.length;i++){
            while(count[i]>0){
                array[j] = i;
                count[i]--;
                j++;
            }
        }
    }
    public static void main(String args[]){
        int array[] = {1,4,1,3,2,4,3,7};
        countsort(array);
        printarray(array);
    }
}
