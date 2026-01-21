// Last updated: 21/01/2026, 22:10:16
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int n:nums){
            a.add(n);
        }
        int s[]=new int[a.size()];
        int index=0;
        for(Integer j:a){
            s[index++]=j;
        }
        Arrays.sort(s);
        if(s.length>=3){
            return s[s.length-3];
        }else{
            return s[s.length-1];
        }
    }
}