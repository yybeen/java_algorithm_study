import java.util.*;

class Solution {
    static HashSet<Integer> set = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        int answer = 0;
        visited = new boolean[numbers.length()];
        
        dfs("", 0, numbers);
        
        answer = set.size();
        
        return answer;
    }
    
    private void dfs(String s, int index, String numbers) {
        if(!s.isEmpty()) {
            int num = Integer.parseInt(s);
            if(isPrime(num)) set.add(num);
        }
        
        if(index == numbers.length()) return;
        
        for(int i = 0; i < numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(s+numbers.charAt(i), index+1, numbers);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}