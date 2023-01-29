import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int sum=0;
        int cnt=0;
        Arrays.sort(d);
        for(int eachd:d){
            if(sum+eachd>budget){
                break;
            }
            sum+=eachd;
            cnt++;
        }
        return cnt;
    }
}