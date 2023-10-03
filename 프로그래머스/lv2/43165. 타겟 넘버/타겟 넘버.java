class Solution {
    private int result = 0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, 0, target);
        answer = result;
        return answer;
    }
    
    private void dfs(int[] numbers, int index, int sum, int target) {
        
        if(index == numbers.length) {
            if(sum == target) {
                result++;
            }
            return;
        }
        
        dfs(numbers, index+1, sum + numbers[index], target);
        dfs(numbers, index+1, sum - numbers[index], target);
    }
}