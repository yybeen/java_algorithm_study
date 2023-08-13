
class Solution {
    private String decimalToBinary(int a){
        String answer = "";
        while(a != 1 && a != 0){
            int tmp = a % 2;
            answer = tmp + answer;
            a /= 2;
        }
        
        if(a==1) answer = '1' + answer;
        
        return answer;
    }
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cntOne = 0;
        
        while(!(s.equals("1"))){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1') cntOne++;
                else answer[1]++;
            }
            s = decimalToBinary(cntOne);
            answer[0]++;
            cntOne = 0;
        }
        
        return answer;
    }
    
}