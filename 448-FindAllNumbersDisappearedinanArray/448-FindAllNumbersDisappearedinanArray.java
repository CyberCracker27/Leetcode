// Last updated: 6/4/2026, 2:56:46 PM
1class Solution {
2    public List<String> buildArray(int[] target, int n) {
3        List<String> li=new ArrayList<>();
4        int[] arr=new int[target.length];
5        int l=target.length;
6        int j=0;
7        for(int i=1;i<=n;i++){
8            if(j<l){
9                arr[j++]=i;
10                li.add("Push");
11            }
12            boolean a=true;
13            for(int k=0;k<target.length;k++){
14                if(target[k]!=arr[k] ){
15                    if(arr[k]!=0){
16                        arr[k]=0;
17                        j--;
18                        li.add("Pop");
19                    }
20                    a=false;
21                    break;
22                }  
23            }
24            if(a){
25                break;
26            }
27        }
28        return li;
29    }
30}