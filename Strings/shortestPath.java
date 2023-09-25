public class shortestPath {
    public static float Shortestpath(String str){ 
        int x = 0 , y = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='w'){
                x--;
            }
            else if(str.charAt(i)=='n'){
                y++;
            }
            else if(str.charAt(i)=='e'){
                x++;
            }
            else{
                y--;
            }
        }
        float sp =  (float) Math.sqrt((x*x)+(y*y));

        return  sp;
    }
    public static void main(String args[]){
        String str = "wneenesennn";
        System.out.println(Shortestpath(str));
    }
}
