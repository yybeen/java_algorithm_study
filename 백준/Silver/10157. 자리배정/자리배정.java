import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);

        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        int x = 1, y = 0, idx = 0, useThisR = C, useThisC = R;
        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        
        if(C*R < K) {
            System.out.println(0);
        }
        else {
            for(int i = 0; i < K; i++) {

                if(useThisC == 0 && dx[idx]==0){
                    C--;
                    useThisR = C;

                    if(idx == 3){
                        idx = 0;
                    } else{
                        idx++;
                    }
                }

                if(useThisR == 0 && dy[idx]==0){
                    R--;
                    useThisC = R;

                    if(idx == 3){
                        idx = 0;
                    } else{
                        idx++;
                    }
                }

                x += dx[idx];
                y += dy[idx];
                useThisC--;
                useThisR--;
            }

            System.out.println(x + " " + y);
        }
    }

    
}
