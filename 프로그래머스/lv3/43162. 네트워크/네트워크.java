class Solution {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean networks[] = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(!networks[i]) {
                dfs(computers, networks, i);
                answer++;
            }
        }
        return answer;
    }
    
    private void dfs(int[][] computers, boolean[] networks, int currentComputer) {
        networks[currentComputer] = true;
        for(int i = 0; i < computers.length; i++) {
            if(currentComputer == i || computers[currentComputer][i] == 0 || networks[i] == true) {
                continue;
            }
            
            dfs(computers, networks, i);
        }
    }
}