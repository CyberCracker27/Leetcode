// Last updated: 9/12/2026, 7:22:11 AM
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