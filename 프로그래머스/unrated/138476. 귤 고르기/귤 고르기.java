import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        //map으로 귤의 크기와 종류의 수를 구한다.
        //종류의 수로 정렬 후 k로 빼기
        
        HashMap<Integer,Integer> map=new HashMap();
        for(int t:tangerine){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        
        List<Integer> keySetList=new ArrayList<>(map.keySet());
        Collections.sort(keySetList,(o1,o2)->(map.get(o2).compareTo(map.get(o1))));
        
        int count=0;
        int answer=0;
        for(Integer key:keySetList){
            if(count>=k){
                break;
            }
            count+=map.get(key);
            answer++;
        }
        
        return answer;
        
    }
}