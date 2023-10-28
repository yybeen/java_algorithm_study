import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = people.length;
        boolean[] saved = new boolean[people.length];
        int maxIndex = people.length - 1;
        
        Arrays.sort(people);

        for(int i = 0; i < people.length; i++) {
            if(!saved[i]) {
                for(int j = maxIndex; j > i; j--) {
                    if(!saved[j] && (people[i] + people[j]) <= limit) {
                        saved[i] = true;
                        saved[j] = true;
                        
                        answer--;
                        maxIndex = j - 1;
                        break;
                    }
                }
            }
            
            if(!saved[i]) {
                break;
            }
        }
        
        return answer;
    }
}