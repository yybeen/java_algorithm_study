import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    
	    int N = Integer.parseInt(br.readLine());
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] array = new int[N];
        
        int result = 0;
        
        for(int i = 0; i < N; i++){
            int value = Integer.parseInt(st.nextToken());
            
            array[i] = value;
        }
        
	    int v = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == v){
                result++;
            }   
        }
        
        System.out.println(result);
	}
}
