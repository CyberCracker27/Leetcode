// Last updated: 7/20/2026, 11:46:56 AM
1import java.util.*;
2
3class Solution {
4   public int reversePairs(int[] nums) {
5       return mergeSort(nums, 0, nums.length - 1);
6   }
7   
8   private static void merge(int[] nums, int low, int mid, int high) {
9       ArrayList<Integer> temp = new ArrayList<>();
10       int left = low;
11       int right = mid + 1;
12       
13       while (left <= mid && right <= high) {
14           if (nums[left] <= nums[right]) {
15               temp.add(nums[left++]);
16           } else {
17               temp.add(nums[right++]);
18           }
19       }
20       while (left <= mid) temp.add(nums[left++]);
21       while (right <= high) temp.add(nums[right++]);
22       
23       for (int i = low; i <= high; i++) {
24           nums[i] = temp.get(i - low);
25       }
26   }
27   
28   private static int CountPairs(int[] nums, int low, int mid, int high) {
29       int cnt = 0;
30       int right = mid + 1;
31       for (int i = low; i <= mid; i++) {
32           while (right <= high && (long) nums[i] > 2L * nums[right]) {
33               right++;
34           }
35           cnt += (right - (mid + 1));
36       }
37       return cnt;
38   }
39   
40   private static int mergeSort(int[] nums, int low, int high) {
41       if (low >= high) return 0;
42       int mid = (low + high) / 2;
43       int cnt = mergeSort(nums, low, mid);
44       cnt += mergeSort(nums, mid + 1, high);
45       cnt += CountPairs(nums, low, mid, high);
46       merge(nums, low, mid, high);
47       return cnt;
48   }
49}