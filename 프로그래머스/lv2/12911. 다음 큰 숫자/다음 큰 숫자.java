class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCnt = Integer.bitCount(n);    
        int answerOneCnt = 0;
        
        while(answerOneCnt != oneCnt) {
            n++;
            answerOneCnt = Integer.bitCount(n);
        }
            
        answer = n;
        
        return answer;
    }
}