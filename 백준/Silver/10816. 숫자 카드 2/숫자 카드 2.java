import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> cardMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int card;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            card = Integer.parseInt(st.nextToken());
            if(cardMap.containsKey(card)) {
                Integer cnt = cardMap.get(card) + 1;
                cardMap.replace(card, cnt);
            }
            else {
                cardMap.put(card, 1);
            }
        }
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            card = Integer.parseInt(st.nextToken());
            if(cardMap.containsKey(card)){
                bw.write(cardMap.get(card) + " ");
            }
            else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
    }
}