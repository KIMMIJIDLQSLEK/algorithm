import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list=new ArrayList();
        
        int j=0;
        while(j<names.length){
            list.add(names[j]);
            j+=5;
        }
        
        String answer[]=list.toArray(new String[list.size()]);
        return answer;
    }
}