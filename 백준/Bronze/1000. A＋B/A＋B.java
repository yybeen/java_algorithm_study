import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = A+B;
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
