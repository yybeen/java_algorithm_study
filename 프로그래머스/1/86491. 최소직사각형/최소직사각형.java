class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int width;
        int height;
        
        if(sizes[0][0] >= sizes[0][1]) {
            width = sizes[0][0];
            height = sizes[0][1];
        }
        else {
            width = sizes[0][1];
            height = sizes[0][0];
        }
        
        for(int i = 1; i < sizes.length; i++) {
            if(sizes[i][0] >= sizes[i][1]) {
                if(width <= sizes[i][0]) {
                    width = sizes[i][0];
                }
                
                if(height <= sizes[i][1]){
                    height = sizes[i][1];
                }
            }
            else {
                if(width <= sizes[i][1]) {
                    width = sizes[i][1];
                }
                
                if(height <= sizes[i][0]){
                    height = sizes[i][0];
                }
            }
        }
        
        answer = width * height;
        return answer;
    }
}