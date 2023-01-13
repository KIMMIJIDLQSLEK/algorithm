class Solution {
    public int solution(int n) {
        int answer=1;
        int i=1;
        while(answer*(i+1)<=n){
            answer*=(++i);
        }

        return i;
    }
}