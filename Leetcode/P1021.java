//Remove outer most parantheses - problem-1021.

public class P1021 {
    public static String removeOuterParentheses(String s) {
        String sb = "";
        int level = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                level++;
            }
            if(level>1){
                sb += s.charAt(i);
            }
            if(s.charAt(i)==')'){
                level--;
            }
        }
        return sb;
    }
}