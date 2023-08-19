public class buyandsellstocks {
    public static int bns(int stocks[]){
        int buyprice = Integer.MAX_VALUE , maxprofit = 0;
        for( int i = 0; i < stocks.length ;i++){
            if(buyprice<stocks[i]){
                int profit = stocks[i] - buyprice;
                maxprofit = Math.max(profit, maxprofit);
            }
            else{
                buyprice = stocks[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int stocks[] = {7 ,1, 5, 3, 6,  4 };
        int a = bns(stocks);
        System.out.println(a);
    }
}
