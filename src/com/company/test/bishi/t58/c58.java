package com.company.test.bishi.t58;

public class c58 {

    public static void main(String[] args) {
        char[][] a = {{'1','0','0'},{'0','0','0'},{'0','0','1'}};
        System.out.println(numIslands(a));
    }
        private static int row; // 二维数组grid的行数
        private static int col; // 列数
        public static int numIslands(char[][] grid) {
            int sum = 0; // 岛屿的总和
            if (grid.length == 0 || grid[0].length == 0) return sum;
            row = grid.length;
            col = grid[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // 若值为'1', 岛屿的数量增加1，进行深度优先搜索，
                    // 把这个位置和通过‘1’连通的其他位置的值变为‘0’
                    if (grid[i][j] == '1') {
                        sum++;
                        dfs(grid, i, j);
                    }
                }
            }
            return sum;
        }

        private static void dfs(char[][] grid, int i, int j) {
            if (grid[i][j] == '1') {
                grid[i][j] = '0';
                // 对上下左右四种情况判断，进行深度优先搜索
                if (i - 1 >= 0) dfs(grid, i - 1, j); // 上
                if (i + 1 < row) dfs(grid, i + 1, j); // 下
                if (j - 1 >= 0) dfs(grid, i, j - 1); // 左
                if (j + 1 < col) dfs(grid, i, j + 1); // 右
            }
        }
    }


