// Last updated: 6/13/2026, 10:35:20 AM
1class Solution {
2    public void solveSudoku(char[][] board) { solve(board);
3    }
4    private boolean solve(char[][] board) {
5        for (int row = 0; row < 9; row++) {
6            for (int col = 0; col < 9; col++) {
7                if (board[row][col] == '.') { 
8                    for (char num = '1'; num <= '9'; num++) {
9                        if (isValid(board, row, col, num)) {
10                            board[row][col] = num;
11                            if (solve(board)) return true;
12                            board[row][col] = '.'; }
13                    }
14                    return false; 
15                }
16            }
17        }
18        return true; 
19    }
20    private boolean isValid(char[][] board, int row, int col, char num) {
21        for (int i = 0; i < 9; i++) {
22            if (board[row][i] == num || board[i][col] == num) return false;
23            int subRow = 3 * (row / 3) + i / 3;
24            int subCol = 3 * (col / 3) + i % 3;
25            if (board[subRow][subCol] == num) return false;
26        }
27        return true;
28    }
29}