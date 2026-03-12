// Last updated: 12/03/2026, 22:13:38
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        if(nums.length==0) return result;
        int num1=nums[0];
        int num2=nums[0];
        int i=0;
        int c=0;
        while(i<nums.length-1){
            if(nums[i]+1==nums[i+1]){
                num2=nums[i];
                i++;
                c++;
            }else{
                if(c==0){
                    result.add(String.valueOf(num1));
                }else{
                    int n=num1+c;
                    result.add(num1+"->"+n);
                }
                i++;
                num1=nums[i];
                num2=nums[i];
                c=0;
            }
        }
        if(c==0){
            result.add(String.valueOf(num1));
        }else{
            int n=num1+c;
            result.add(num1+"->"+n);
        }
        return result;
    }
}