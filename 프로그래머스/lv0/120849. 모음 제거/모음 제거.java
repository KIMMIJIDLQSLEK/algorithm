class Solution {
    public String solution(String my_string) {
        String[] removeAlphabet={"a","e","i","o","u"};

        for(String alpha:removeAlphabet){
            my_string=my_string.replace(alpha,"");
        }
        return my_string;
    }
}