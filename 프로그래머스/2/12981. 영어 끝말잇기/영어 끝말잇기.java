import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> set = new HashSet<>();
        int current_person = 0;
        int current_turn = 0;
        for(int i = 0; i < words.length; i++) {
            current_person = i%n + 1;
            current_turn = i/n + 1;
            if(set.contains(words[i])) {
                answer[0] = current_person;
                answer[1] = current_turn;
                return answer;
            }
            
            if(i != 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                answer[0] = current_person;
                answer[1] = current_turn;
                return answer;
            }
            
            set.add(words[i]);
        }
        return answer;
    }
}