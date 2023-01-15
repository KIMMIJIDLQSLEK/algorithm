import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<String> li=Arrays.asList(my_string.split(""));
        List<String> result=new ArrayList<>();
        String answer="";

        for(String val:li){
            if(result.contains(val)==false){
                result.add(val);
            }
        }

        for(String r:result){
            answer+=r;
        }

        return answer;
    }
}