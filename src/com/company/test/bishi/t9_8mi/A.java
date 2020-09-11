package com.company.test.bishi.t9_8mi;

import java.util.Scanner;

class A {
    boolean[][] mark;
    int direction[][] = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    //多少行
    int m;
    //多少列
    int n;
    String word;
    char[][] board;

    boolean ex(char[][] board, String word) {
        m = board.length;
        if (m == 0) {
            return false;
        }
        n = board[0].length;
        mark = new boolean[m][n];
        this.word = word;
        this.board = board;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int i, int j, int start) {
        if (start == word.length() - 1) {
            return board[i][j] == word.charAt(start);
        }
        if (board[i][j] == word.charAt(start)) {
            mark[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int newx = i + direction[k][0];
                int newy = i + direction[k][1];
                if (inArea(newx, newy) && !mark[newx][newy]) {
                    if (dfs(newx, newy, start + 1)) {
                        return true;
                    }
                }
            }
            mark[i][j] = false;
        }
        return false;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','F'}};
        String word = sc.next();
        A a = new A();
        boolean exist = a.ex(board,word);
        System.out.println(exist);
    }
}
