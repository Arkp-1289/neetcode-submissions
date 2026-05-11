class MedianFinder {

    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;
    
    public MedianFinder() {
        max= new PriorityQueue<>(Collections.reverseOrder());
        min=new PriorityQueue<>();   
    }
    
    public void addNum(int num) {
     if (max.isEmpty() || max.peek()>num){
            max.offer(num);
        } else{
            min.offer(num);
        }

        if (max.size()>min.size()+1){
            min.offer(max.poll());
        } else if (min.size()>max.size()+1){
            max.offer(min.poll());
        }

    }
    
    public double findMedian() {
        if (max.size()>min.size()){
            return max.peek();
        } else if (max.size()<min.size()){
            return min.peek();
        }
        return (double)(max.peek()+min.peek())/2;
        
    }
}
