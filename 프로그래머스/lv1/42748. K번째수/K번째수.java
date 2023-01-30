import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer=new ArrayList();
        
        for(int[] command:commands){
            int[] list=new int[command[1]-command[0]+1];
            for(int i=0;i<list.length;i++){
                list[i]=array[command[0]-1+i];
            }
            Arrays.sort(list);
            answer.add(list[command[2]-1]);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}