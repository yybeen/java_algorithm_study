import java.io.*;
import java.util.*;

public class Main
{
    public static boolean[] visited = new boolean[9];
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] height = new int[1002];
		
		int minL = 1001;
		int maxL = 0;
		int maxH = 0;
		int highestH = 0;
		int highestL = 0;
		int answer = 0;
		
		for(int i = 0; i < N; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int L = Integer.parseInt(st.nextToken());
		    int H = Integer.parseInt(st.nextToken());
		    height[L] = H;
		    minL = Math.min(minL, L);
		    maxL = Math.max(maxL, L);
		    if(highestH < H) {
		        highestH = H;
		        highestL = L;
		    }
		}
		
		int width = 1;
		for(int left = minL + 1; left <= highestL; left++) {
		    if(height[left] == 0 || height[left-1] > height[left] ) {
		        width++;
		        height[left] = height[left-1];
		    }
		    else {
		        answer += width * height[left-1];
		        width = 1;
		    }
		}
		
		answer += width * highestH;
		width = 1;
		
		for(int right = maxL - 1; right >= highestL; right--) {
		    if(height[right] == 0 || height[right] < height[right+1]) {
		        width++;
		        height[right] = height[right+1];
		    }
		    else {
		        answer += width * height[right+1];
		        width = 1;
		    }
		}
		
		System.out.println(answer);
	}
}
