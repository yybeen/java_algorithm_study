import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = "";
        int ascii;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < 97) {
                ascii = s.charAt(i)+32;
                result += (char) ascii;
            }
            else {
                ascii = s.charAt(i)-32;
                result += (char) ascii;
            }
        }
        System.out.println(result);
    }
}
