import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int firstScore = 0;
        int secondScore = 0;
        int thirdScore = 0;
        int maxResult = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(first[i % 5] == answers[i]) {
                firstScore++;
            }
            if(second[i % 8] == answers[i]) {
                secondScore++;
            }
            if(third[i % 10] == answers[i]) {
                thirdScore++;
            }
        }
        
        maxResult = Math.max(Math.max(firstScore, secondScore), thirdScore);
        
        if(firstScore == maxResult) {
            answer.add(1);
        }
        if(secondScore == maxResult) {
            answer.add(2);
        }
        if(thirdScore == maxResult) {
            answer.add(3);
        }
        
        return answer;
    }
}