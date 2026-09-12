// Last updated: 9/12/2026, 7:21:14 AM
class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(char c:word.toCharArray()){
            set.add(c);
        }
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(set.contains(ch) && set.contains((char)(ch-'a'+'A'))){
                count++;
            }
        }
        return count;
    }
}