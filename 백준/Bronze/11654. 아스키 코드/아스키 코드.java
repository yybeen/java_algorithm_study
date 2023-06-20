import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int asciiValue = s.charAt(0);
        
        System.out.println(asciiValue);
    }
}
