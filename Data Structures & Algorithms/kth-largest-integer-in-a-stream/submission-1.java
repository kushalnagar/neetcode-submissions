class KthLargest {

    PriorityQueue<Integer> minHeap;
    int K;
    public KthLargest(int k, int[] nums) {
        K = k;
        //arr = new ArrayList();
        minHeap = new PriorityQueue<Integer>();

        for (int num: nums){
            minHeap.offer(num);
            if(minHeap.size() > K){
                minHeap.poll();
            }
        }
        /*for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }*/
    }

    public int add(int val) {
        /*arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size() - K);*/

        minHeap.offer(val);
        if(minHeap.size() > K){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
