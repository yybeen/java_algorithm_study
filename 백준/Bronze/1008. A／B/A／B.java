import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        double result = a/b;

        System.out.println(result);
    }
}
