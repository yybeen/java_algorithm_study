import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
      StringTokenizer st = new StringTokenizer(s);

      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      int[] score = new int[n];

      s = br.readLine();
      st = new StringTokenizer(s);
      
      for(int i = 0; i < n; i++) {
        score[i] = Integer.parseInt(st.nextToken());
      }

      s = br.readLine();
      
      while(s != null) {
        st = new StringTokenizer(s);
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        double sum = 0;
        
        for(int i = start-1; i <= end-1; i++) {
          sum += score[i];
        }
        
        double avg = sum/(end-start+1);

        System.out.println(String.format("%.2f", avg));

        s = br.readLine();
      }
    }
}
