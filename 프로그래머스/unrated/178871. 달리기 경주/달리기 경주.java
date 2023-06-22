import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> name_key_map = new HashMap<>();
        Map<Integer, String> rank_key_map = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            name_key_map.put(players[i], i+1);
            rank_key_map.put(i+1, players[i]);
        }
        
        for(int i=0; i<callings.length; i++){
            int cur_rank = name_key_map.get(callings[i]);
            String cur_name = rank_key_map.get(cur_rank-1);
            rank_key_map.replace(cur_rank, cur_name);
            rank_key_map.replace(cur_rank-1, callings[i]);
            name_key_map.replace(cur_name, cur_rank);
            name_key_map.replace(callings[i], cur_rank-1);
        }
        
        for(int i = 1; i<=rank_key_map.size(); i++){
            answer[i-1] = rank_key_map.get(i);
        }
        
        return answer;
    }
}