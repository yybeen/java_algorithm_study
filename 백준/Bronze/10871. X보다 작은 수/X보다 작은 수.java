import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    int X = Integer.parseInt(st.nextToken());
        
        List<Integer> result = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a<X) {
                result.add(a);
            }
        }
        
        for(int i = 0; i < result.size(); i++){
            System.out.printf("%d ",result.get(i));
        }
	}
}
