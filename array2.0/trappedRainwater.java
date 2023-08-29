public class trappedRainwater {

    public static int trp(int height[]){

        //calculate leftmax boundry
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i =1;i<height.length;i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //clculate rightmax boundry
        int rightmax[] = new int[height.length];
        rightmax[height.length-1]= height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        //calculate trapped water
        int trappedwater = 0;
        for(int i = 0 ;i<height.length;i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;

    }
    public static void main(String []args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,};
        System.out.println(trp(height));
    }
}
