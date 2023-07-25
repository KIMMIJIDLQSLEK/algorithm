class Solution {
    public int solution(int a, int b) {
        int strInt=Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        
        if(strInt<2*a*b){
            return 2*a*b;
        }
        return strInt;
    }
}