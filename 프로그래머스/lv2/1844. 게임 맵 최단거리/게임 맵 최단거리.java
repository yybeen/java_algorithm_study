import java.util.*;

class Location {
    private int x;
    private int y;
    
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class Solution {
    
    public int solution(int[][] maps) {
        int answer = 999999;
        int totalMoved = 0;
        int dx[] = {0, 0, -1, 1};
        int dy[] = {1, -1, 0, 0};
        
        int maxX = maps.length;
        int maxY = maps[0].length;
        
        boolean visited[][] = new boolean[maxX][maxY];
        int dist[][] = new int[maxX][maxY];
        
        for(int i = 0; i < maxX; i++) {
            for(int j = 0; j < maxY; j++) {
                dist[i][j] = 999999;
            }
        }
        
        Queue<Location> q = new LinkedList<>();
        
        q.add(new Location(0,0));
        dist[0][0] = 1;
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            Location location = q.poll();
            
            for(int i = 0; i < 4; i++){
                int nextX = location.getX() + dx[i];
                int nextY = location.getY() + dy[i];
                
                if(nextX < 0 || nextX >= maxX || nextY < 0 || nextY >= maxY || visited[nextX][nextY] == true || maps[nextX][nextY] == 0) {
                    continue;
                }
                
                dist[nextX][nextY] = dist[location.getX()][location.getY()] + 1;
                visited[nextX][nextY] = true;
                
                if(nextX == maxX - 1 && nextY == maxY - 1) {
                    return dist[nextX][nextY];
                }
                
                q.add(new Location(nextX, nextY));
            }
            
        }
        
        if(answer == 999999) {
            answer = -1;
        }
        
        return answer;
    }
}