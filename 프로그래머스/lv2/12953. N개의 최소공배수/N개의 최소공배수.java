class Solution {
    public int gcd(int a,int b){
        int minNum=0;
        if(a>b){
            minNum=b;
        }else{
            minNum=a;
        }
        
        int gcdNum=0;
        for(int i=minNum;i>0;i--){
            if(a%i==0&&b%i==0){
                gcdNum=i;
                break;
            }
        }
        return gcdNum;
    }
    public int solution(int[] arr) {
        //각 두수의 최대공약수를 구하고 최소공배수를 구한다.
        int before=arr[0];
        int lcmNum=0;
        for(int i=1;i<arr.length;i++){
            int gcdNum=gcd(before,arr[i]);
            lcmNum=(before*arr[i])/gcdNum;
            
            before=lcmNum;
        }
        
        return lcmNum;
    }
}