class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> b -a);

        for(int stone: stones){
            queue.offer(stone);
        }

        while(queue.size()>1){
            int first = queue.poll();
            int second = queue.poll();

            if(second != first){
                queue.offer(first-second);
            }
        }

        return queue.isEmpty()?0:queue.poll();
    }
}
