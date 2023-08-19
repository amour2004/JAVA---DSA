public class que_4 {
    public static int trappedwater(int numbers[]){
        int n = numbers.length;
        int leftmax[] = new int[n];
         leftmax[0] = numbers[0];
        for(int i = 1;i<n;i++){
             leftmax[i] = Math.max(numbers[i], leftmax[i-1]);
        }
        int rightmax[] = new int[n];
        rightmax[n-1] = numbers[n-1];
        for(int j =n-2;j>=0;j--){
            rightmax[j] = Math.max(numbers[j], rightmax[j+1]);
        }
        int trappedWater = 0;
        for(int i = 0;i<n;i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterlevel - numbers[i];
        }
        return trappedWater;
    }    
    public static void main(String args[]){
        int numbers[] = {4, 2, 0, 3, 2, 5};
        int a = trappedwater(numbers);
        System.out.println(a);
    }

}
