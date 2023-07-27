import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Long S = Long.parseLong(br.readLine());
    Long cnt = 0L;

    while(S>=0){
        cnt++;
        S-=cnt;
    }

    if(S == 0){
        System.out.println(cnt);
    }
    else{
        System.out.println(cnt-1);
    }
    }
}
