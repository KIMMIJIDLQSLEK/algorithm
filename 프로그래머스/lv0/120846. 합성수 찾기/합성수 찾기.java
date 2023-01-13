class Solution {
    public int solution(int n) {
        
        int cnt=0;
        //1과 자기자신을 뺸 나머지의 수에 하나의 약수가 존재할 경우=> 합성수(약수의 개수가 세 개 이상인 수)
        for(int i=1;i<=n;i++){
            if(i<=3){
                continue;
            }
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}