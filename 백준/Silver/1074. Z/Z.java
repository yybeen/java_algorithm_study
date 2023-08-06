import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int cnt = 0;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int mapSize = (int)Math.pow(2, N);

        find(mapSize, r, c);
        System.out.println(cnt);
    }

    public static void find(int mapSize, int r, int c) {
        if(mapSize == 1){
            return;
        }

        if(r<mapSize/2 && c<mapSize/2) { // r행 c열이 1사분면에 위치
            find(mapSize/2, r, c);
        }
        else if(r<mapSize/2 && c>=mapSize/2) { // r행 c열이 2사분면에 위치
            cnt += mapSize/2 * mapSize/2;
            find(mapSize/2, r, c-mapSize/2);
        }
       else if(r>=mapSize/2 && c<mapSize/2) { // r행 c열이 3사분면에 위치
            cnt += mapSize/2 * mapSize/2 * 2;
            find(mapSize/2, r-mapSize/2, c);
        }
        else { // r행 c열이 4사분면에 위치
            cnt += mapSize/2 * mapSize/2 * 3;
            find(mapSize/2, r-mapSize/2, c-mapSize/2);
        }
    }
}
