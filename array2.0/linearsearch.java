public class linearsearch {
    public static int ls(int numbers[], int key){
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2 , 3, 4, 45 , 12, 34, 89};
        int key = 14;
        int ans = ls(numbers, key);
        if(ans == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is at index " + ans);
        }
    }
}
