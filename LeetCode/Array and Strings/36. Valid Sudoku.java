class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValid(board, i, i, 0, 8)) return false;
            if(!isValid(board, 0, 8, i, i)) return false;
        }
        
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValid(board, i, i + 2, j, j + 2)) return false;
            }
        }
        
        return true;
    }
    
    private boolean isValid(char[][] board, int rowS, int rowE, int colS, int colE) {
        int[] flag = new int[10];
        
        for (int i = rowS; i <= rowE; i++) {
            for (int j = colS; j <= colE; j++) {
                if (board[i][j] == '.') continue;
                
                int n = board[i][j] - '1';
                
                if (flag[n] == 1) return false;
                
                flag[n] = 1;
            }
        }
        
        return true;
    }
}