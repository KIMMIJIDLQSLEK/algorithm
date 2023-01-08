class Solution {
    public String solution(String letter) {
        String answer="";
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        String[] letterList=letter.split(" ");

        for(int i=0;i<letterList.length;i++){
            for(int j=0;j<morse.length;j++){
                if(letterList[i].equals(morse[j])){
                    answer+=(char)(j+'a');
                }
            }
        }
        return answer;
    }
}