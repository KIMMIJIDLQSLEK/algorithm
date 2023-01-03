class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer=new int[2];
        //분자 구하기
        int denum=denum1*num2+denum2*num1;
        //분모 구하기
        int num=num1*num2;
        //분자와 분모의 최대공약수 구하기
        int min_num=0;
        if(denum<num){
            min_num=denum;
        }
        else{
            min_num=num;
        }
        for(int i=min_num;i>=2;i--)
        {
            if(denum%i==0 && num%i==0)
            {
                denum/=i;
                num/=i;
                break;
            }

        }
        
                
        answer[0]=denum;
        answer[1]=num;
        
        return answer;
    }
}