import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int score = Integer.parseInt(s);
        String result = "";

        if(score <= 100 && score >= 90) {
            result = "A";
        }
        else if(score <= 89 && score >= 80) {
            result = "B";
        }
        else if(score <= 79 && score >= 70) {
            result = "C";
        }
        else if(score <= 69 && score >= 60) {
            result = "D";
        }
        else {
            result = "F";
        }

        System.out.println(result);
    }
}
