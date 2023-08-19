public class pairs {
    public static void subArryayy(int numbers[]){
        for(int i = 0;i<numbers.length;i++){
            for(int j = i +1; j<numbers.length;j++){
                System.out.print("("+numbers[i] +","+ numbers[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = { 9, 12, 20, 24, 56 ,57 , 89};
        subArryayy(numbers);
    }
}
