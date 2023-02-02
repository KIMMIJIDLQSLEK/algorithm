class Solution {
    public int binaryNum(int num){
        int cnt=0;
        while(num>0)
        {
            if(num%2==1){
                cnt++;
            }
            num/=2;
        }
        return cnt;
    }
    public int solution(int n) {
        int nNum=binaryNum(n);
        
        while(true){
            n++;
            int bigNum=binaryNum(n);
            if(nNum==bigNum){
                break;
            }
        }
        return n;
    }
}