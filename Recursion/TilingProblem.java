public class TilingProblem {
    public static int numberOfWaysToTile(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return numberOfWaysToTile(n - 1) + numberOfWaysToTile(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(numberOfWaysToTile(4));
    }
}
