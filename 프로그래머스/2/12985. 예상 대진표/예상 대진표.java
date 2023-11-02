class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int big = 0;
        int small = 0;
        
        if(a>b) {
            big = a;
            small = b;
        }
        else {
            big = b;
            small = a;
        }
        
        while(n!=1) {
            if(big - small == 1 && big % 2 == 0) {
                break;
            }
            
            big = round(big);
            small = round(small);
            
            answer++;
            n /= 2;
        }

        return answer;
    }
    
    private int round(int n) {
        if(n % 2 == 0) {
            return n / 2;
        }
        else {
            return (n / 2) + 1;
        }
    }
}