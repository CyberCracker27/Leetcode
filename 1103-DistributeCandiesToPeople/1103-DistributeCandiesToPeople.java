// Last updated: 9/12/2026, 7:37:54 AM
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int nums[]=new int[num_people];
        int j=0;
        int i=0;
        while(candies>0){
            j++;
            i=i%num_people;
            if(j<=candies){
                nums[i++]+=j;
            }else{
                nums[i++]+=candies;
            }
            
            candies-=j;
        }
        return nums;
    }
}