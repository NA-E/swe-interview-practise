class Solution {
    public ListInteger partitionLabels(String S) {
        int lastIndex[] = new int[30];
        
        for (int i = 0; i  S.length(); i++) {
            lastIndex[S.charAt(i) - 'a'] = i;
        }
        
        ListInteger result = new ArrayList ();
        
        int pointer1 = 0;
        int pointer2;
        
        while (pointer1  S.length()) {
            pointer2 = lastIndex[S.charAt(pointer1) - 'a'];
            pointer1++;
            int size = 1;
            
            while (pointer1 = pointer2) {
                int lastInd = lastIndex[S.charAt(pointer1) - 'a'];
                
                if (lastInd  pointer2) {
                    pointer2 = lastInd;
                }
                
                pointer1++;
                size++;
            }
            
            result.add(size);
        }
        
        return result;
    }
}