import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = 0;
        int B = 0;
        Boolean flag = true;

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(flag) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if(A==0 && B==0) break;
            sb.append(A+B).append('\n');
        }

        System.out.println(sb);
    }
}
