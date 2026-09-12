// Last updated: 9/12/2026, 7:22:03 AM
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            String s=Integer.toBinaryString(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
            }
            if(count==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}