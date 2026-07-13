// Last updated: 7/13/2026, 8:45:19 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max1=0;
        for(int i=0;i<nums.length;i++){
            int max=0;
            int min=Integer.MAX_VALUE;
            int temp=nums[i];
            while(temp!=0){
                int d=temp%10;
                max=Math.max(max,d);
                min=Math.min(min,d);
                temp/=10;
            }
            int c=max-min;
            if(c>max1){
                max1=c;
            }
            map.put(i,c);
        }
        int f=0;
        for(int x:map.keySet()){
            if(max1==map.get(x)){
                f+=nums[x];
            }
        }
        return f;
    }
}