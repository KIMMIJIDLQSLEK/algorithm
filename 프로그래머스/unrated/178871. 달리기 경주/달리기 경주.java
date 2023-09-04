import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        //map으로 player와 등수를 저장하도록 생성
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        
        for(String calling:callings){
            //players 배열 swap
            int rank=map.get(calling);
            
            String beforePlayer=players[rank-1];
            players[rank-1]=players[rank];
            players[rank]=beforePlayer;
            
            //map의 등수를 갱신 put
            map.put(beforePlayer,rank);
            map.put(players[rank-1],rank-1);
            
        }
        
        return players;
        
    }
}