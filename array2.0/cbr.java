public class cbr {
    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[]args){
        int marks[] = {78,88,91};
        update(marks);
        for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }

}
