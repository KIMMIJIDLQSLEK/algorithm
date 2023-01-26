class Solution {
    public String solution(int n) {
        String letter="수박";
        String answer=letter.repeat(n/2);
        if(n%2==1){
            answer+="수";
        }
        return answer;
    }
}