import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] matrixA = new int[N][M];
        int[][] matrixB = new int[N][M];
        int a, b;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                a = Integer.parseInt(st.nextToken());
                matrixA[i][j] = a;
            }
        }

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                b = Integer.parseInt(st.nextToken());
                matrixB[i][j] = b;

            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.printf("%d ", matrixA[i][j] + matrixB[i][j]);
            }
            System.out.println();
        }
    }
}
