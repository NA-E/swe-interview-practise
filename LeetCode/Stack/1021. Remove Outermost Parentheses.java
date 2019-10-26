class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<> ();
        StringBuilder strBuild = new StringBuilder();
        
        int start = 0;
        
        char[] charArr = S.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(') {
                stack.push(charArr[i]);
            } else if (charArr[i] == ')') {
                stack.pop();
            }
            
            if (stack.empty()) {
                strBuild.append(S.substring(start + 1, i));
                start = i + 1;
            }
        }
        
        return strBuild.toString();
    }
}