class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, new Integer[] {i, j});
                    result++;
                }
            }
        }
    
        return result;
    }
    
    private void bfs(char[][] grid, Integer[] position) {
        int R = grid.length;
        int C = grid[0].length;
        int x = position[0];
        int y = position[1];
        
        Queue<Integer[]> queue = new LinkedList<> ();
        queue.add(position);
        grid[x][y] = '0';
        
        while(queue.peek() != null) {
            Integer[] land = queue.poll();
            x = land[0];
            y = land[1];
            
            if (x - 1 >= 0 && grid[x-1][y] == '1') {
                grid[x-1][y] = '0';
                queue.add(new Integer[] {x-1, y});
            }
            
            if (x + 1 < R && grid[x+1][y] == '1') {
                grid[x+1][y] = '0';
                queue.add(new Integer[] {x+1, y});
            }
            
            if (y - 1 >= 0 && grid[x][y-1] == '1') {
                grid[x][y-1] = '0';
                queue.add(new Integer[] {x, y-1});
            }
            
            if (y + 1 < C && grid[x][y+1] == '1') {
                grid[x][y+1] = '0';
                queue.add(new Integer[] {x, y + 1});
            }
        }
    }
}