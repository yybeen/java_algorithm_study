import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int stoneCnt = Integer.parseInt(br.readLine());
      int[] stones = new int[stoneCnt];
      int[] dp = new int[stoneCnt];
      int answer = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      for(int i = 0; i < stoneCnt; i++) {
        stones[i] = Integer.parseInt(st.nextToken());
        dp[i] = 1;
      }

      for(int i = 0; i < stoneCnt; i++) {
        for(int j = 0; j < i; j++) {
          if(stones[j] < stones[i]) {
            dp[i] = Math.max(dp[i], dp[j] + 1);
          }
        }
      }

      for(int i = 0; i < stoneCnt; i++) {
        answer = Math.max(answer, dp[i]);
      }
      System.out.print(answer);
    }
}
