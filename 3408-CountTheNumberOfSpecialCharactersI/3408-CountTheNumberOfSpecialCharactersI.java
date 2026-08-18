// Last updated: 8/18/2026, 6:49:25 AM
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