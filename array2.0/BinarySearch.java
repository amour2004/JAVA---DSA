public class BinarySearch {
    public static int Binarys(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
            }
            if (numbers[mid] > key) { // for left part of an array
                end = mid - 1;
            } else { // for right part of an array
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 12, 14, 45, 67, 77, 89, 91 };
        int key = 91;
        int ans = Binarys(numbers, key);
        if (ans == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is found and is at index " + ans);
        }
    }

}
