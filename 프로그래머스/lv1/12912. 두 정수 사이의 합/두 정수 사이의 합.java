class Solution {
    public long solution(int a, int b) {
        int maxNum=a>b?a:b;
        int minNum=a>=b?b:a;
        
        long answer=0;
        for(int i=minNum;i<=maxNum;i++){
            answer+=i;
        }
        return answer;
    }
}