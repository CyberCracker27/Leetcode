// Last updated: 8/3/2026, 9:29:16 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int x:candies){
            max=Math.max(max,x);
        }
        List<Boolean> li=new ArrayList<>();
        for(int x:candies){
            if(x+extraCandies>=max){
                li.add(true);
            }else{
                li.add(false);
            }
        }
        return li;
    }
}