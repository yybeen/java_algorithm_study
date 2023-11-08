import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(Integer i : map.keySet()) {
            pq.add(map.get(i));
        }
        
        while(k > 0) {
            int current = pq.poll();
            k -= current;
            answer++;
        }
        
        return answer;
    }
}