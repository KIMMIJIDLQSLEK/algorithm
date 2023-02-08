class Solution {
    public int[] solution(String s) {
        int[] result={0,0};
        while(!s.equals("1")){
            int len=s.replace("0","").length();
            result[0]++;
            result[1]+=s.length()-len;

            String binaryString="";
            while(len!=0){
                binaryString+=Integer.toString(len%2);
                len/=2;
            }
            s=binaryString;
        }
        
        
        return result;
    
        
    }
}