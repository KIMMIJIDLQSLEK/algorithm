class Solution {
    public String solution(int n) {
        String answer="";
        String[] num={"4","1","2"};
        
        while(n>0){
            int div=n%3;
            n/=3;
            
            if(div==0){
                n--;
            }
            
            answer=num[div]+answer;
        }
        
        return answer;
    }
}