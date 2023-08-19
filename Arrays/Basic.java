public class Basic{
    public static void update(int marks[]){
        for(int i = 0; i< marks.length;i++){
        marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = { 98, 97, 96};
        
        update(marks);
         
         System.out.println("Physics: "+marks[0]);
         System.out.println("chemistry: "+marks[1]);
         System.out.println("maths: "+marks[2]);
    }
}