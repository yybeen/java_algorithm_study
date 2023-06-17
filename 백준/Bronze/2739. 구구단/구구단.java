import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=1 ; i<10 ; i++){
            result = N*i;
            System.out.printf("%d * %d = %d\n", N, i, result);
        }
    }
}
