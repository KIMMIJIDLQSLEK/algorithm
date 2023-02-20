import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        //map으로 귤의 크기와 종류의 수를 구한다.
        //종류의 수로 정렬 후 k로 빼기
        int MAXVALUE=10000000;
        int[] bucket=new int[MAXVALUE+1];
        
        for(int t:tangerine){
            bucket[t]++;
        }
        Arrays.sort(bucket);
        
        int answer=0;
        while(k>0){
            k-=bucket[MAXVALUE--];
            answer++;
        }
        
        return answer;
    }
}