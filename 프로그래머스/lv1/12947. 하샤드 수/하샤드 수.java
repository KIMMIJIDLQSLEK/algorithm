class Solution {
    public boolean solution(int x) {
        int xSum=0;
        int value=x;
        while(value!=0){
            xSum+=value%10;
            value/=10;
        }
        
        return x%xSum==0?true:false;
    }
}