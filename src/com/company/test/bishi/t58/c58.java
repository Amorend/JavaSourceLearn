package com.company.test.bishi.t58;

public class c58 {

    public static void main(String[] args) {
        char[][] a = {{'1','0','0'},{'0','0','0'},{'0','0','1'}};
        System.out.println(numIslands(a));
    }
        private static int row; // ��ά����grid������
        private static int col; // ����
        public static int numIslands(char[][] grid) {
            int sum = 0; // ������ܺ�
            if (grid.length == 0 || grid[0].length == 0) return sum;
            row = grid.length;
            col = grid[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // ��ֵΪ'1', �������������1�������������������
                    // �����λ�ú�ͨ����1����ͨ������λ�õ�ֵ��Ϊ��0��
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
                // ������������������жϣ����������������
                if (i - 1 >= 0) dfs(grid, i - 1, j); // ��
                if (i + 1 < row) dfs(grid, i + 1, j); // ��
                if (j - 1 >= 0) dfs(grid, i, j - 1); // ��
                if (j + 1 < col) dfs(grid, i, j + 1); // ��
            }
        }
    }


