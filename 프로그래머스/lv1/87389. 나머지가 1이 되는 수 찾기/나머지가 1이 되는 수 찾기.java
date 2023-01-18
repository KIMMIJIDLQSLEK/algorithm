class Solution {
    public int solution(int n) {
        //1부터 시작하여 나머지가 1인 수 반환
        int x=1;
      
        while(x<n){
            if(n%x==1){
                break;
            }
            x++;
        }
        return x;

    }
}