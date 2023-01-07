class Solution {
    public String solution(String my_string, int n) {
        char[] strArray=my_string.toCharArray();
        
        String answer="";
        for(char c:strArray){
            for(int i=0;i<n;i++){
                answer+=c;
            }
        }
        return answer;
    }
}