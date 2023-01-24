class Solution {
    public int solution(String t, String p) {
        int cnt=0;
        for(int i=0;i<=t.length()-p.length();i++){
            long num=Long.parseLong(t.substring(i,i+p.length()));
            if(num<=Long.parseLong(p)){
                cnt++;
            }
        }
        
        return cnt;
    }
}