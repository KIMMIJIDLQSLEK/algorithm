import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        ArrayList arrayList=new ArrayList<Integer>();
        int[] answer=new int[emergency.length];

        for(int i=0;i<emergency.length;i++){
            arrayList.add(emergency[i]);
        }

        arrayList.sort(Comparator.reverseOrder());

        for(int i=0;i<emergency.length;i++){
            answer[i]=arrayList.indexOf(emergency[i])+1;
        }

        return answer;
    }
}