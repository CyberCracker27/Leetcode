// Last updated: 6/13/2026, 7:31:47 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        
4        for(int i=0;i<9;i++){
5            HashSet<Character> a=new HashSet<>();
6            HashSet<Character> b=new HashSet<>();
7            HashSet<Character> c=new HashSet<>();
8            for(int j=0;j<9;j++){
9                if(board[i][j]!='.'){
10                    if(!a.add(board[i][j])) return false;
11                }
12                if(board[j][i]!='.'){
13                    if(!b.add(board[j][i])) return false;
14                }
15                int row=3*(i/3)+j/3;
16                int col=3*(i%3)+j%3;
17                if(board[row][col]!='.'){
18                    if(!c.add(board[row][col])) return false;
19                }
20            }
21        }
22        return true;
23    }
24}