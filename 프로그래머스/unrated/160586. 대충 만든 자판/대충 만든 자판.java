class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphabet = new int[26];
        int alphabetNum;
        int cnt = 0;
        
        for(String s : keymap) {
            for(int i = 0; i < s.length(); i++) {
                alphabetNum = s.charAt(i) - 65;
                if(alphabet[alphabetNum] > (i + 1) || alphabet[alphabetNum] == 0) {
                    alphabet[alphabetNum] = i + 1;
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            cnt = 0;
            for(int j = 0; j < targets[i].length(); j++) {
                alphabetNum = targets[i].charAt(j) - 65;
                if(alphabet[alphabetNum] == 0) {
                    cnt = -1;
                    break;
                }
                    cnt += alphabet[alphabetNum];
            }
            answer[i] = cnt;
        }
        return answer;
    }
}