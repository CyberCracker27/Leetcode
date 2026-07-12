// Last updated: 7/12/2026, 8:25:25 AM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int arr1[]=arr.clone();
4        Arrays.sort(arr1);
5        HashMap<Integer,Integer> map=new HashMap<>();
6        int r=1;
7        for(int x:arr1){
8            if(!map.containsKey(x)){
9                map.put(x,r);
10                r++;
11            }
12        }
13        for(int i=0;i<arr.length;i++){
14            arr[i]=map.get(arr[i]);
15        }
16        return arr;
17    }
18}