// Last updated: 9/12/2026, 7:22:16 AM
class Solution {
    public String sortVowels(String s) {
        List<Character> li=new ArrayList<>();
        for(char x:s.toCharArray()){
            if("aeiouAEIOU".contains(String.valueOf(x))){
                li.add(x);
            }
        }
        Collections.sort(li);
        StringBuilder st=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".contains(String.valueOf(s.charAt(i)))){
                st.append(li.get(j++));
            }else{
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}