// Last updated: 9/12/2026, 7:37:06 AM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mindiff=Math.min(mindiff,arr[i]-arr[i-1]);
        }
        List<List<Integer>> li=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            List<Integer> li2=new ArrayList<>();
            if(mindiff==arr[i]-arr[i-1]){
                li2.add(arr[i-1]);
                li2.add(arr[i]);
                li.add(li2);
            }
        }
        return li;
    }
}