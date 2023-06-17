import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int result = 0;

        if(X>0 && Y>0){
            result = 1;
        }
        else if(X<0 && Y>0){
            result = 2;
        }
        else if(X<0 && Y<0){
            result = 3;
        }
        else {
            result = 4;
        }

        System.out.println(result);
    }
}
