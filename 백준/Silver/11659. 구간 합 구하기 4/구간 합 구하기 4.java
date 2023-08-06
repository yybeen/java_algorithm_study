import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] prefixSum = new int[N+1];
        int[] answer = new int[M];
        s = br.readLine();
        st = new StringTokenizer(s);

        prefixSum[1] = Integer.parseInt(st.nextToken());

        for(int k = 2; k <= N; k++){
            prefixSum[k] = prefixSum[k-1] + Integer.parseInt(st.nextToken());
        }

        for(int k = 0; k < M; k++){
            s = br.readLine();
            st = new StringTokenizer(s);
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            answer[k] = prefixSum[j] - prefixSum[i-1];

        }

        for(int k = 0; k < M; k++) {
            System.out.println(answer[k]);
        }
    }
}
