class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || word == null || word.length() == 0) return false;
        
        int R = board.length;
        int C = board[0].length;
        
        boolean[][] flag = new boolean[R][C];
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] == word.charAt(0)) {
                    flag[i][j] = true;
                    if (isExist(board, word, flag, 0, i, j, R, C)) return true;
                    
                    flag[i][j] = false;
                }
            }
        }
        
        return false;
    }
    
    private boolean isExist(char[][] board, String word, boolean[][] flag, int index,
                            int i, int j, int R, int C) {
        if (index == word.length() - 1) {
            if (board[i][j] == word.charAt(index)) return true;
            
            return false;
        }
        
        boolean ifExist = false;
        
        if (i - 1 >= 0 && !flag[i-1][j] && board[i-1][j] == word.charAt(index + 1)) {
            flag[i-1][j] = true;
            ifExist = isExist(board, word, flag, index + 1, i - 1, j, R, C);
            
            if (ifExist) return true;
            
            flag[i-1][j] = false;
        }
        
        if (i + 1 < R && !flag[i+1][j] && board[i+1][j] == word.charAt(index + 1)) {
            flag[i+1][j] = true;
            ifExist = isExist(board, word, flag, index + 1, i + 1, j, R, C);
            
            if (ifExist) return true;
            
            flag[i+1][j] = false;
        }
        
        if (j - 1 >= 0 && !flag[i][j-1] && board[i][j-1] == word.charAt(index + 1)) {
            flag[i][j-1] = true;
            ifExist = isExist(board, word, flag, index + 1, i, j - 1, R, C);
            
            if (ifExist) return true;
            
            flag[i][j - 1] = false;
        }
        
        if (j + 1 < C && !flag[i][j+1] && board[i][j+1] == word.charAt(index + 1)) {
            flag[i][j+1] = true;
            ifExist = isExist(board, word, flag, index + 1, i, j+1, R, C);
            
            if (ifExist) return true;
            
            flag[i][j+1] = false;
        }
        
        return false;
    }
}