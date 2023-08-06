import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        int maxInt = Integer.parseInt(st.nextToken());
        int minInt = maxInt;
        while(st.hasMoreTokens()){
            int newInt = Integer.parseInt(st.nextToken());
            
            maxInt = Math.max(newInt, maxInt);
            minInt = Math.min(newInt, minInt);
        }
        answer = minInt + " " + maxInt;
        return answer;
    }
}