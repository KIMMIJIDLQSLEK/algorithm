class Solution {
    public int[] solution(String s) {
        int[] result={0,0};
        while(!s.equals("1")){
            int len=s.replace("0","").length();
            result[0]++;
            result[1]+=s.length()-len;
            
            String binaryString=Integer.toBinaryString(len);
            s=binaryString;
        }
        
        
        return result;
    
        
    }
}