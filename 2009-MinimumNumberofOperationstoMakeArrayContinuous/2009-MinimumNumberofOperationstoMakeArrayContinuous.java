// Last updated: 7/20/2026, 11:47:37 AM
1class Solution {
2    public int minOperations(int[] nums) {
3        int length = nums.length;
4        int minOperations = length;
5        Set<Integer> uniqueNums = new HashSet<>();
6        for (int num : nums) {
7            uniqueNums.add(num);
8        }
9        Integer[] sortedUniqueNums = uniqueNums.toArray(new Integer[uniqueNums.size()]);
10        Arrays.sort(sortedUniqueNums);
11        int right = 0;
12
13        for (int left = 0; left < sortedUniqueNums.length; left++) {
14            while (right < sortedUniqueNums.length && sortedUniqueNums[right] < sortedUniqueNums[left] + length) {
15                right++;
16            }
17
18            minOperations = Math.min(minOperations, length - (right - left));
19        }
20
21        return minOperations;        
22    }
23}