import java.util.*;
class Solution {
    public String[] solution(String myString) {
            String[] list=myString.split("x");

        ArrayList<String> answer=new ArrayList<>();
        for(int i=0;i<list.length;i++){
            if(!list[i].equals("")) answer.add(list[i]);
        }

        String[] result=answer.toArray(new String[answer.size()]);
        Arrays.sort(result);

        return result;
    
    }
}