import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            if(clothesMap.containsKey(clothes[i][1])) {
                clothesMap.put(clothes[i][1], clothesMap.get(clothes[i][1]) + 1);
            }
            else {
                clothesMap.put(clothes[i][1], 1);
            }
        }
        
        for(String key: clothesMap.keySet()) {
            answer *= clothesMap.get(key) + 1;
        }
        
        return answer-1;
    }
}