public class linearsearch {
    public static int ls(int marks[],int key){
        for(int i = 0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[] = {98, 99, 78, 66, 89};
        int b = ls(marks, 78);
        System.out.println(b);
    }
}
