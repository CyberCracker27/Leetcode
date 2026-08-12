// Last updated: 8/12/2026, 6:58:21 AM
class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            sum+=num;
            set.add(num);
        }
        double avg=(double)sum/nums.length;
        int can=Math.max(1,(int)Math.floor(avg)+1);
        while(set.contains(can)){
            can++;
        }
        return can;
    }
}