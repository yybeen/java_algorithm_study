import java.util.*;

class Solution {
    public List<Integer> solution(int brown, int yellow) {
        List<Integer> answer = new ArrayList<>();
        int column = 0;
        int row = 0;
        
        for(int i = 1; i <= yellow; i++) {
            if(yellow % i != 0) {
                continue;
            }
            column = i;
            row = yellow / i;
            
            if(column+row == (brown - 4) / 2) {
                if(column >= row) {
                    answer.add(column+2);
                    answer.add(row+2);
                }
                else {
                    answer.add(row+2);
                    answer.add(column+2);
                }
                break;
            }
        }
        return answer;
    }
}