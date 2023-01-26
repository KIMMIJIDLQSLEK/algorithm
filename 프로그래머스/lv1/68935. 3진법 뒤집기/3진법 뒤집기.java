class Solution {
    public int solution(int n) {
        //n을 3진법으로 구하기

        int i=1;
        int cnt=0;
        while(true){
            cnt++;

            if(i*3>n){
                break;
            }
            i*=3;
        }

        String threeN="";
        for(int j=0;j<cnt;j++){
            threeN+=Integer.toString(n/i);
            n%=i;
            i/=3;
        }

        //앞뒤 반전하여 10진수로 바꾸기

        i=1;
        int answer=0;
        for(int j=0;j<threeN.length();j++){
            answer+=(threeN.charAt(j)-'0')*i;
            i*=3;
        }
        return answer;
    }
}