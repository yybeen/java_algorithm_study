import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String s = "";
        List<String> list = new ArrayList<>();

        for(int i=0; i<T; i++) {
            s = br.readLine();
            list.add(s);
        }

        for(int i=0; i<list.size(); i++) {
            System.out.println( list.get(i).charAt(0)+ "" + list.get(i).charAt(list.get(i).length()-1));
        }
    }
}