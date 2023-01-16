class Solution {
    public String solution(String s) {
        String[] words=s.split("");
        String answer="";

        int idx=0;
        for(String word:words){
            if(word.equals(" ")){
                answer+=" ";
                idx=0;
                continue;
            }

            if(idx%2==0){
                answer+=word.toUpperCase();
            }else {
                answer += word.toLowerCase();
            }
            idx++;
        }
        return answer;
    }
}