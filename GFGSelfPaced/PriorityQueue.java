package GFGSelfPaced;

import java.util.PriorityQueue;

class PairPQ{

    public static void main(String[] args) {
        //Max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int[] arr = new int[]{3,1,2,4};
        for(int i: arr)pq.add(i);

    }
}

