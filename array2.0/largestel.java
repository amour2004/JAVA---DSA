public class largestel{
    public static int le(int marks[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<marks.length;i++){
            if(marks[i]>largest){
                largest = marks[i];
            }
        }
        return largest;
    }

    public static void main(String[]args){
        int marks[] = { 45, 34, 67, 98, 78, 88};
        System.out.println("Maximum marks from given array is " + le(marks));
    }

}