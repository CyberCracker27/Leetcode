// Last updated: 9/12/2026, 7:40:04 AM
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>c){
                c=map.get(nums[i]);
            }
        }
        List<Integer> li=new ArrayList<>();
        for(int x:map.keySet()){
            if(map.get(x)==c){
                li.add(x);
            }
        }
        int f=Integer.MAX_VALUE;
        for(int i=0;i<li.size();i++){
            int g=li.get(i);
            int k=-1;
            int q=0;
            for(int j=0;j<nums.length;j++){
                if(k==-1 && nums[j]==g){
                    k=j;
                }
                if(k!=-1 && nums[j]==g){
                    q=j-k;
                }
            }
            if(q<f){
                f=q;
            }
        }
        return f+1;
    }
}