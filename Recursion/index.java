public class index {
    public static void decresingNumber(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        decresingNumber(num - 1);
    }

    public static void incresingOrder(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        incresingOrder(num - 1);
        System.out.println(num);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    public static int sumOFNaturalNum(int num) {
        if (num == 1) {
            return num;
        }
        return sumOFNaturalNum(num - 1) + num;
    }

    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }

        if(num == 1){
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void firstOccurance(int arr[],int i,int Key){
        if(i < 0){
            System.out.println("Key not found");
            return;
        }

        if(arr[i] == Key){
            System.out.println("Key is found and is at index "+i);
            return;
        }

        firstOccurance(arr, i-1, Key);

    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        
        // if(n == 1){
        //     return x;
        // }

        return x * power(x, n-1);
    }

    public static int optimizedPower(int a , int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n%2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
    }

    public static void main(String args[]) { 
        // decresingNumber(10);
        // incresingOrder(10);
        // System.out.println(factorial(5));
        // System.out.println(sumOFNaturalNum(5));
        // System.out.println(fibonacci(5));
        int arr[] = {4,2,3,4,5,7,6,5};
        // System.out.println(isSorted(arr, 0));
        // firstOccurance(arr, arr.length-1, 4);
        System.out.println(power(5,1));
    }
}
