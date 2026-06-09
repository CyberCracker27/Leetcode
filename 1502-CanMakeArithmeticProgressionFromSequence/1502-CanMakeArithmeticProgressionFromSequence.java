// Last updated: 6/9/2026, 9:38:58 AM
1class Solution {
2    public int pivotInteger(int n) {
3        int i=1,j=n,c=-1;
4        int leftc=1,rightc=n;
5        while(i<j){
6            if(leftc<=rightc){
7                i++;
8                leftc+=i;
9            }else{
10                j--;
11                rightc+=j;
12            }
13        }
14        return (leftc==rightc)?i:-1;
15    }
16}