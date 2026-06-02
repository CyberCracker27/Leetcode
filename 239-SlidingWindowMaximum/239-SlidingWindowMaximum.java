// Last updated: 6/2/2026, 4:20:43 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] a, int k) {
3        int n = a.length;
4		int[] r = new int[n-k+1];
5		int ri = 0;
6		Deque<Integer> q = new ArrayDeque<>();
7		for (int i = 0; i < a.length; i++) {
8			if(!q.isEmpty() && q.peekFirst() < i - k + 1) {
9				q.pollFirst();
10			}
11			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
12				q.pollLast();
13			}
14			q.offer(i);
15			if (i >= k - 1) {
16				r[ri++] = a[q.peekFirst()];
17			}
18		}
19		return r;              
20    }
21}