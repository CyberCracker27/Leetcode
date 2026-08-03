// Last updated: 8/3/2026, 9:28:04 AM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(List<String> a:items){
            if(ruleKey.equals("type") && ruleValue.equals(a.get(0))){
                c++;
            }    
            if(ruleKey.equals("color") && ruleValue.equals(a.get(1))){
                c++;
            }
            if(ruleKey.equals("name") && ruleValue.equals(a.get(2))){
                c++;
            }   
        }
        return c;
    }
}