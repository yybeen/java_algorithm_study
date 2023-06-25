
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[][] parkArea = new int[park.length][park[0].length()];
        int startX = 0, startY = 0;
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    parkArea[i][j] = 1;
                }
                else if(park[i].charAt(j) == 'O') {
                    parkArea[i][j] = 1;
                }
                else {
                    parkArea[i][j] = 0;
                }
            }
        }
        
        for(String route : routes){
            char direction = route.charAt(0);
            int distance = route.charAt(2) - '0';
            int newX = 0, newY = 0;
            boolean pass = false;
            switch(direction) {
                case 'N':
                    newX = startX - distance;
                    if(newX >= 0) {
                        for(int k=startX; k>=newX; k--) {
                            if(parkArea[k][startY] == 0) {
                                pass = true;
                                break;
                            }
                        }
                        if(!pass){
                            startX = newX;
                        }
                    }
                    break;
                case 'S':
                    newX = startX + distance;
                    if(newX < parkArea.length) {
                        for(int k=startX; k<=newX; k++) {
                            if(parkArea[k][startY] == 0) {
                                pass = true;
                                break;
                            }
                        }
                        if(!pass){
                            startX = newX;
                        }
                    }
                    break;
                case 'W':
                    newY = startY - distance;
                    if(newY >= 0) {
                        for(int k=startY; k>=newY; k--) {
                            if(parkArea[startX][k] == 0) {
                                pass = true;
                                break;
                            }
                        }
                        if(!pass){
                            startY = newY;
                        }
                    }
                    break;
                case 'E':
                    newY = startY + distance;
                    if(newY < parkArea[0].length) {
                        for(int k=startY; k<=newY; k++) {
                            if(parkArea[startX][k] == 0) {
                                pass = true;
                                break;
                            }
                        }
                        if(!pass){
                            startY = newY;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        
        answer[0] = startX;
        answer[1] = startY;
        return answer;
    }
}