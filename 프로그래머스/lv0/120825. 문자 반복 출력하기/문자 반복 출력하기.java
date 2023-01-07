class Solution {
    public String solution(String my_string, int n) {
        String[] strArray=my_string.split("");
        String answer="";

        for(String str:strArray){
            for(int i=0;i<n;i++){
                answer+=str;
            }
        }
        return answer;
    }
}