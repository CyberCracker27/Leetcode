// Last updated: 7/13/2026, 8:54:21 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            int number=1;
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                l.add(number);
                number=number*(i-j)/(j+1);
            }
            li.add(l);
        }
        return li;
    }
}