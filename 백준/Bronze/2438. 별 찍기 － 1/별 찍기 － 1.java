import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String star = "";

        for(int i=1; i<=N; i++){
            star = "";
            for(int j=0; j<i; j++){
                star += '*';
            }
            System.out.println(star);
        }
    }
}
