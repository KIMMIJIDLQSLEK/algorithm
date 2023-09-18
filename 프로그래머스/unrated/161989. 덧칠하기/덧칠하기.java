class Solution {
    public int solution(int n, int m, int[] section) {
        int[] paint=new int[n+1];
        int answer=0;
        
        for(int i=0;i<section.length;i++){
            paint[section[i]]=1;
        }
        
        int start=1;
        while(start<=n){
            if(paint[start]==0){
                start++;
                continue;
            } 
            
            for(int i=0;i<m;i++){
                if(start+i>n) break;
                paint[start+i]=0;
            }
            answer++;
            
        }
        
        return answer;
        
    }
}