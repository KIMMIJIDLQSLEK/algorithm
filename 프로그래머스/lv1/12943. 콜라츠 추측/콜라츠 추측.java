class Solution {
     public int solution(double num) {
        //짝수이면 /2
        //홀수이면 *3+1
        //500번 반복시 1이 나온다면 0
        //500번 반복해도 1이 나오지 않을 경우 -1

        int cnt=0;
        while(cnt<500){

            if(num==1){
                if(cnt==0) {
                    return 0;
                }else{
                    return cnt;
                }
            }

            if(num%2==0){
                num=num/2;
            }else{
                num=Math.abs(num*3)+1;
            }
            cnt++;
        }
        return -1;

    }
}