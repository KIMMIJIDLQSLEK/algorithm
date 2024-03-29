import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        
        Arrays.sort(targets, (o1,o2)->o1[1]-o2[1]);
        
        int end=targets[0][1];
        int answer=0;
        answer++;
        
        for(int[] target:targets){
            if(target[0]>=end){
                answer++;
                end=target[1];
            }
        }
        return answer;
    }
}