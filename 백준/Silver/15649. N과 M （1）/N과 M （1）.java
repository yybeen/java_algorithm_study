/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main
{
    public static boolean[] visited = new boolean[9];
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
		    String s = i + "";
		    visited[i] = true;
		    dfs(M, N, s, 1);
		    visited[i] = false;
		}
	}
	
	public static void dfs(int maxDepth, int N, String seq, int cnt) {
	    if(maxDepth == cnt) {
	        System.out.println(seq);
	        return;
	    }
	    
	    for(int i = 1; i <= N; i++) {
	        if(!visited[i]) {
	            visited[i] = true;
	            dfs(maxDepth, N, seq + " " + i, cnt + 1);
	            visited[i] = false;
	        }
	    }
	}
}
