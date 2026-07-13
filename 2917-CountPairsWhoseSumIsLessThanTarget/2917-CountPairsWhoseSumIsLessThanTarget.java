// Last updated: 7/13/2026, 8:47:06 PM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int f=0;
        for(int i=0;i<nums.size()-1;i++){
            int c=nums.get(i);
            for(int j=i+1;j<nums.size();j++){
                c+=nums.get(j);
                if(c<target){
                    f++;
                }
                c=nums.get(i);
            }
            
        }
        return f;
    }
}