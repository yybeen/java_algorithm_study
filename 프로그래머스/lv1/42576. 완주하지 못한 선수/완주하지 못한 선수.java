import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> completionMap = new HashMap<>();
        
        for(String c: completion) {
            if(completionMap.containsKey(c)) {
                completionMap.put(c, completionMap.get(c)+1);
            }
            else {
                completionMap.put(c, 1);
            }
        }
        
        for(String p: participant) {
            if(completionMap.containsKey(p)) {
                completionMap.put(p, completionMap.get(p)-1);
            }
            else {
                return p;
            }
        }
        
        for(String p: participant) {
            if(completionMap.get(p) != 0){
                answer = p;
            }
        }
        return answer;
    }
}