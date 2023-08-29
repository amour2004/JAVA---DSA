public class Kadane {
    public static int kadanes(int numbers[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;
            for(int i = 0;i<numbers.length;i++){
                cs = cs + numbers[i];
                if(cs<0){
                    cs = 0;
                }
                if (cs > ms){
                    ms = cs;
                }
                ms = Math.max(cs, ms);
            }
            return ms;
    }
}
