class Solution {
    public int[] solution(int n, int m) {
        //최소값 찾기
        //최대공약수 구하기
        //최송공배수=n*m/최대공약수
            
         int min=0;
        if(n<m){
            min=n;
        }else{
            min=m;
        }
        
        int gcd=0;
        for(int i=min;i>0;i--){
            if(n%i==0&&m%i==0){
                gcd=i;
                break;
            }
        }
        
        int lcm=m*n/gcd;

        int[] answer={gcd,lcm};
        
        return answer;
        
    }
}