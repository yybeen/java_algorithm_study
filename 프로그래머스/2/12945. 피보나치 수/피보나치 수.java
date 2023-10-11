class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for(int i = 2; i < n+1; i++) {
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % 1234567;
        }
        
        answer = fibonacci[n];
        return answer;
    }
}