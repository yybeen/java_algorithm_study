import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        List<String> list = new ArrayList<>();
        while((s = br.readLine()) != null){
            list.add(s);
        }

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}