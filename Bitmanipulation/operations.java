public class operations {
    public static int Getithbit(int num, int n){
        int bitMask = 1<<n;
        if((bitMask&num)==0){
            return 0;
        }
        else{
          return 1;
        }
    }
    public static int setithbit(int num,int n){
        int bitMask = 1<<n;
        return num|bitMask;
    }

    public static int Clearithbit(int num, int n){
        int bitMask = 1<<n;
        return num^bitMask;
    }
    public static int Updateithbit(int num,int n, int value){
        int bitMask = 1<<n;
        if(value == 1){
            return num|bitMask;
        }
        else{
            return num^bitMask;
        }
    }

    public static int Clearlastibits(int num,int n){
        int bitMask = (~0)<<n;
        return num & bitMask;
    }
    
    public static int clearIBits(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean checkPower(int num){
        if((num & (num-1)) == 0){
            return true;
        }
        return false;
    }

    public static int setBits(int num){
        String s=String.valueOf(num); 
        int count = 0;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    public static int countSet(int num){
        int count = 0;
        while(num>0){
            if((num&1)!=0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String args[]){
        // Getithbit(7,3);
        // setithbit(7, 3);
        // System.out.println(Clearithbit(10, 1));
        // System.out.println(Updateithbit(10,2,1));
        // System.out.println(clearIBits(14, 1, 3));

        // System.out.println(checkPower(2));

        // System.out.println(setBits(1010));

        // System.out.println(Integer.toBinaryString(15));
        System.out.println(countSet(15));
        
    }
}
