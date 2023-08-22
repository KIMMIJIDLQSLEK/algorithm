class Solution {
    public int solution(String myString, String pat) {
        //pat이 myString보다 길면 return false
        if(myString.length()<pat.length()) return 0;
        
        //소문자로 변환 후 pat이 myString안에 있는지 확인
        pat=pat.toLowerCase();
        myString=myString.toLowerCase();
        for(int i=0;i<=myString.length()-pat.length();i++){
            if(myString.substring(i,i+pat.length()).equals(pat)) return 1;
        }
        
        return 0;
    }
}