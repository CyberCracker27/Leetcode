// Last updated: 7/13/2026, 8:47:02 PM
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> li=new ArrayList<>();
        if(mountain.length<3) return li;
        for(int j=2;j<mountain.length;j++){
            if(mountain[j-2]<mountain[j-1] && mountain[j-1]>mountain[j]){
                li.add(j-1);
            }
        }
        return li;
    }
}