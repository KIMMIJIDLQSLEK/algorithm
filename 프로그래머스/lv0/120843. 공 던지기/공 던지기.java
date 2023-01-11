class Solution {
    public int solution(int[] numbers, int k) {
        
        int cnt=1;
        int now=1;
        while(cnt<k){
            cnt++;
            now+=2;
            if(now>numbers.length){
                now%=numbers.length;
            }

        }
        return now;

    }
}