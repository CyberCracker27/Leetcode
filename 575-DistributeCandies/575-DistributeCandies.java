// Last updated: 9/12/2026, 7:40:24 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> a=new HashSet<>();
        for(int x:candyType){
            a.add(x);
        }
        int b=candyType.length/2;
        if(a.size()>b){
            return b;
        }else{
            return a.size();
        }
    }
}