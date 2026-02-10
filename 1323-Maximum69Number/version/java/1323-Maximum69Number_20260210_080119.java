// Last updated: 10/02/2026, 08:01:19
1class Solution {
2    public int maximum69Number (int num) {
3        char[] digit=String.valueOf(num).toCharArray();
4        for(int i=0;i<digit.length;i++){
5            if(digit[i]=='6'){
6                digit[i]='9';
7                break;
8            }
9        }
10        return Integer.parseInt(new String(digit));
11    }
12}