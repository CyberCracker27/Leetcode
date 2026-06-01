// Last updated: 6/1/2026, 9:14:41 PM
class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> count=new HashSet<>();
        int start =0;
        int len=word.length();
        while(start<len){
            if(!Character.isDigit(word.charAt(start))){
                start++;
                continue;
            }
            int end=start;
            while(end<len && Character.isDigit(word.charAt(end))){
                end++;
            }
            while(start<end && word.charAt(start)=='0'){
                start++;
            }
            count.add(word.substring(start,end));
            start=end;
        }
        return count.size();
    }
}