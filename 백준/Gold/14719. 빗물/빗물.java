import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		int[] height = new int[W];
		int answer = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < W; i++) {
		    height[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i < W-1; i++) {
		    int left = 0;
		    int right = 0;
		    
		    for(int j = 0; j < i; j++) {
		        left = Math.max(left, height[j]);
		    }
		    
		    for(int j = W-1; j > i; j--) {
		        right = Math.max(right, height[j]);
		    }
		    
		    if(left!=0 && right!=0 && left>height[i] && right>height[i]) {
		        if(left >= right) {
		            answer += right - height[i];
		        }
		        else {
		            answer += left - height[i];
		        }
		    }
		}
		
		System.out.println(answer);
	}
}
