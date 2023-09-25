public class furthestFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int r = 0, d = 0;
        for(int i = 0;i<moves.length();i++){
            if (moves.charAt(i)=='L') r--;
            if (moves.charAt(i)=='R') r++;
            if (moves.charAt(i)=='_') d++;
        }
        return Math.abs(r) + d;
}
}
