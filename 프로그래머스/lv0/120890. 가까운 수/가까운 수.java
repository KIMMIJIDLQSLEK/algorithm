import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int minVal=Integer.MAX_VALUE;
        int answer=0;
        Arrays.sort(array);
        for(int num:array){
            int value=Math.abs(n-num);
            if(value<minVal){
                minVal=Math.abs(n-num);
                answer=num;
            }
        }
        return answer;
    }
}