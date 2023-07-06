class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = -1, luy = -1, rdx = -1, rdy = -1;
        
        for(int x = 0; x < wallpaper.length; x++) {
            for(int y = 0; y < wallpaper[x].length(); y++){
                if(wallpaper[x].charAt(y) == '#'){
                    if(lux == -1 || lux > x) {
                        lux = x;
                    }
                    if(luy == -1 || luy > y) {
                        luy = y;
                    }
                    if(rdx == -1 || rdx < x+1) {
                        rdx = x+1;
                    }
                    if(rdy == -1 || rdy < y+1) {
                        rdy = y+1;
                    }
                }
            }
        }
        int[] answer = {lux, luy, rdx, rdy};
        
        return answer;
    }
}