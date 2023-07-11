class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int checkedWall = 0;
        for(int i = 0; i < section.length; i++){
            if(checkedWall < section[i]) {
                checkedWall = section[i] + m - 1;
                answer++;
            }
            if(checkedWall > n) break;
        }
        return answer;
    }
}