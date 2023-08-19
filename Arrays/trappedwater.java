public class trappedwater {
    public static int twater(int height[]) {
        int n = height.length;
        // left max height
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) { // Corrected loop condition
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // right max height
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) { // Corrected loop condition
            rightmax[j] = Math.max(height[j], rightmax[j + 1]);
        }
        // waterlevel = min (leftmaxheight , rightmaxheight) - height
        int trapwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlevel - height[i];
        }
        return trapwater;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6,3, 2, 5};
        int trappedWater = twater(height);
        System.out.println("Trapped water: " + trappedWater);
    }
}
