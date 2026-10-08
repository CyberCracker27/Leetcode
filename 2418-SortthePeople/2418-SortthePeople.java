// Last updated: 10/8/2026, 6:50:53 AM
1class Solution {
2    public String[] sortPeople(String[] names, int[] heights) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<heights.length;i++){
5            map.put(heights[i],i);
6        }
7        Arrays.sort(heights);
8        int i=0,j=heights.length-1;
9        while(i<j){
10            int temp=heights[i];
11            heights[i]=heights[j];
12            heights[j]=temp;
13            i++;
14            j--;
15        }
16        String arr[]=new String[names.length]; 
17        for(int k=0;k<heights.length;k++){
18            arr[k]=names[map.get(heights[k])];
19        }
20        return arr;
21    }
22}