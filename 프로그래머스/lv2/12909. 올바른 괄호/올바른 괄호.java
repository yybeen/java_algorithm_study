class Solution {
    boolean solution(String s) {
        int front = 0;
        int back = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') front++;
            else back++;
            
            if(front < back) return false;
        }
        
        if(front > back) return false;
        
        return true;
    }
}