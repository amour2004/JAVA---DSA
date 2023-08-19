public class array1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return an empty array or throw an exception.
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] indices = twoSum(nums, target);
        System.out.println("[" + indices[0] + "," + indices[1] + "]");
    }
}
