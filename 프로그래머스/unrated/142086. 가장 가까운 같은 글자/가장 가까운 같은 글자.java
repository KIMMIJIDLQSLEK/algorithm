import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] bucket=new int[26];
        Arrays.fill(bucket,-1);
        int[] result=new int[s.length()];

        for(int i=0;i<s.length();i++){
            char charS=s.charAt(i);
            if(bucket[charS-'a']==-1){
                result[i]=bucket[charS-'a'];
            }
            else{
                result[i]=i-bucket[charS-'a'];
            }
            bucket[charS-'a']=i;
        }

        return result;
    }
}