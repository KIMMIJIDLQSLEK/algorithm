//1->1
//2->(1,1),(2)->2
//3->(1,2),(2,1),(1,1,1)->3
//4->(1,1,1,1),(1,1,2),(1,2,1),(2,1,1),(2,2)->5
//5->(1,1,1,1,1),(1,1,1,2),(1,1,2,1),(1,2,1,1),(2,1,1,1),(2,2,1),(2,1,2),(1,2,2)->8
class Solution {
    public long solution(int n) {
        //팩토리얼
        long[] buffer=new long[2001]; //0~2000
        buffer[0]=1;
        buffer[1]=1;
        
        for(int i=2;i<=n;i++){
            buffer[i]=buffer[i-1]%1234567+buffer[i-2]%1234567;
        }
        
        return buffer[n]%1234567;
    }
}