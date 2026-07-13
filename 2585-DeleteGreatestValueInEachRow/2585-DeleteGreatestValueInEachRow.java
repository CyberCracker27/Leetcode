// Last updated: 7/13/2026, 8:47:52 PM
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        List<List<Integer>> li=new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> li1=new ArrayList<>();
            for (int num : row) {
                li1.add(num);
            }
            li.add(li1);
        }
        int c=0;
        for(int i=0;i<grid[0].length;i++){
            int max=0;
            for(int j=0;j<li.size();j++){
                List<Integer> l=li.get(j);
                int x=Collections.max(l);
                li.get(j).remove(Integer.valueOf(x));
                if(x>max){
                    max=x;
                }
            }
            c+=max;
        }
        return c;
    }
}