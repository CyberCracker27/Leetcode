// Last updated: 7/13/2026, 8:52:48 PM
class MedianFinder {
    List<Integer> li=new ArrayList<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        int idx = Collections.binarySearch(li, num);

        if (idx < 0) {
            idx = -idx - 1;
        }

        li.add(idx, num);
    }
    
    public double findMedian() {
        if(li.size()%2==0){
            return (double)(li.get((li.size()/2)-1)+li.get((li.size()/2)))/2;
        }else{
            return (double)(li.get(li.size()/2));
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */