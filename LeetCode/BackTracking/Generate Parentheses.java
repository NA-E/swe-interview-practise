class Solution {
    
    private List<String> result = new ArrayList<> ();
    
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            result.add("");
            
            return result;
        }
        
        generate(n - 1, n, new StringBuilder("("));
        
        return result; 
    }
    
    private void generate(int openC, int closeC, StringBuilder sb) {
        if (openC == 0 && closeC == 0) {
            result.add(sb.toString());
            return;
        }
        
        StringBuilder newSb = new StringBuilder(sb.toString());
        
        if (openC > 0) {
            sb.append("(");
            generate(openC - 1, closeC, sb);
        }
        
        if (openC < closeC) {
            newSb.append(")");
            generate(openC, closeC - 1, newSb);
        }
        
        return;
    }
}