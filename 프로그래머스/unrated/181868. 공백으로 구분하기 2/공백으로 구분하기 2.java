import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] str=my_string.split(" ");
        
        ArrayList<String> list=new ArrayList();
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("")){
                list.add(str[i]);
            }
        }
        
        String[] answer=list.toArray(new String[list.size()]);
        return answer;
    }
}