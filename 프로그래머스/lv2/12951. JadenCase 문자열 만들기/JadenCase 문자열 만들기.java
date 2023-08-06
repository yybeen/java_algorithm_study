import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s," ", true);
        
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            if(word.equals(" ")) {
                answer += " ";
                continue;
            }
            char firstLetter = word.charAt(0);
            if(!Character.isDigit(firstLetter)){
                if(firstLetter>='a' && firstLetter<='z'){
                    firstLetter = Character.toUpperCase(firstLetter);
                }
                
                if(word.length()==1) {
                    answer += firstLetter;
                }
                else{
                    answer += firstLetter + word.substring(1).toLowerCase();
                }

            }
            else {
                answer += word.toLowerCase();
            }
        }
        
        return answer;
    }
}