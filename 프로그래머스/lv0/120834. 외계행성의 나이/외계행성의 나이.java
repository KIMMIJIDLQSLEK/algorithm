class Solution {
    public String solution(int age) {
        String[] alphabet={"a","b","c","d","e","f","g","h","i","j"};
        String answer="";

        String stringAge=Integer.toString(age);
        for(int i=0;i<stringAge.length();i++){
            int index=Integer.valueOf(stringAge.charAt(i)-'0');
            answer+=alphabet[index];
        }

        return answer;
    }
}