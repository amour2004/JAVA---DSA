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
    public static int ClearRangeOgBits(int num, int i, int j){
        int bitMask = (~0)>>i | (~0)<<j;
        return num & bitMask;

         
    }

    public static void main(String args[]){
        // Getithbit(7,3);
        // setithbit(7, 3);
        // System.out.println(Clearithbit(10, 1));
        // System.out.println(Updateithbit(10,2,1));
        System.out.println(Clearlastibits(15, 2));
    }
}
