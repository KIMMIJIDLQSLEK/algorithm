class Solution {
    public String solution(String my_string) {
         
        String answer="";
        String[] strArray=my_string.split("");
        
        for(int i=strArray.length-1;i>=0;i--){
            answer+=strArray[i];
        }

        return answer;
    }
}