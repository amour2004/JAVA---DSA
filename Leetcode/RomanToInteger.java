public class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                sum += 1;
            } else if (s.charAt(i) == 'V') {
                if (s.charAt(i - 1) == 'I') {
                    sum -= 1;
                }
                sum += 5;
            } else if (s.charAt(i) == 'X') {
                if (s.charAt(i - 1) == 'I') {
                    sum -= 1;
                }
                sum += 10;
            } else if (s.charAt(i) == 'L') {
                if (s.charAt(i - 1) == 'X') {
                    sum -= 10;
                }
                sum += 50;
            } else if (s.charAt(i) == 'C') {
                if (s.charAt(i - 1) == 'X') {
                    sum -= 10;
                }
                sum += 100;
            } else if (s.charAt(i) == 'D') {
                if (s.charAt(i - 1) == 'C') {
                    sum -= 100;
                }
                sum += 500;
            } else if (s.charAt(i) == 'M') {
                if (s.charAt(i - 1) == 'C') {
                    sum -= 100;
                }
                sum += 1000;
            }
        }
        return sum;
    }
}
