public class qu3_3 {
    public static int que_3(int numbers[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0;i<numbers.length;i++){
            if(buyprice<numbers[i]){
                int profit = buyprice - numbers[i];
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buyprice =numbers[i];
            }
        }
        return maxprofit;
    }    
    public static void main(String args[]) {
        int numbers[] = {7,6,4,3,1};
        int a = que_3(numbers);
        System.out.println(a);
    }
}
