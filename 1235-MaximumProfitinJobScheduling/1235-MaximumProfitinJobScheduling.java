// Last updated: 6/6/2026, 9:19:52 AM
1class Solution {
2    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
3        int n=startTime.length;
4        int[][] arr=new int[n][3];
5        int[] start=new int[n];
6        for(int i=0;i<n;i++){
7            arr[i][0]=startTime[i];
8            arr[i][1]=endTime[i];
9            arr[i][2]=profit[i];
10            start[i]=arr[i][0];
11        }
12        Arrays.sort(start);
13        Arrays.sort(arr,(a,b)->a[0]-b[0]);
14        int[] ans=new int[n+1];
15        for(int i=n-1;i>=0;i--){
16            int curr=arr[i][2];
17            int end=arr[i][1];
18            int after=0;
19            // for(int j=i+1;j<n;i++){
20            //     if(arr[j][1]>=end){
21            //         after=arr[j][2];
22            //         break;
23            //     }else{
24            //         after=0;
25            //     }
26            // }
27            int left=i+1,right=n-1;
28            int next=n;
29
30            while(left<=right){
31                int mid=(left+right)/2;
32
33                if(start[mid]>=end){
34                    next=mid;
35                    right=mid-1;
36                }else{
37                    left=mid+1;
38                }
39            }
40
41            if(next<n)
42                after=ans[next];
43            int a=curr+after;
44            if(a<ans[i+1]){
45                ans[i]=ans[i+1];
46            }else{
47                ans[i]=curr+after;
48            }
49            System.out.print(ans[i]+" ");
50
51        }
52        return ans[0];
53    }
54}