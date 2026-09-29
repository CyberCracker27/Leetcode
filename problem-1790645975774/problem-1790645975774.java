// Last updated: 9/29/2026, 7:09:35 AM
1class Solution {
2    public int passwordStrength(String password) {
3        int c=0;
4        Set<Character> se=new HashSet<>();
5        for(char ch:password.toCharArray()){
6            se.add(ch);
7        }
8        for(char ch:se){
9            if(Character.isLowerCase(ch)){
10                c++;
11            }
12            else if(Character.isUpperCase(ch)){
13                c+=2;
14            }
15            else if(Character.isDigit(ch)){
16                c+=3;
17            }else{
18                c+=5;
19            }
20        }
21        return c;
22    }
23}