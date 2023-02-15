import java.util.*;
class Solution {
   public int solution(String dirs) {
        /*
        dirs를 돌면서 현재 위치를 arraylist에 넣는다.(출발점(x,y), 방향) cnt++;
        출발점이 arraylist에 있는지 확인 후 없으면 cnt++;
        출발점이 경계 밖으로 나가면 cnt 생략
        */

        List<ArrayList> location=new ArrayList();
        Map<String,Integer> direction=new HashMap<>();
        direction.put("U",1);
        direction.put("D",2);
        direction.put("R",3);
        direction.put("L",4);

        int cnt=0;
        int x=0;
        int y=0;

        for(String dir: dirs.split("")){

            ArrayList<Integer> l1=new ArrayList(Arrays.asList(x,y,direction.get(dir)));
            ArrayList<Integer> l2;

            if(dir.equals("U")){
                l2=new ArrayList(Arrays.asList(x,y+1,direction.get(dir)+1));
            }else if(dir.equals("D")){
                l2=new ArrayList(Arrays.asList(x,y-1,direction.get(dir)-1));
            }else if(dir.equals("L")){
                l2=new ArrayList(Arrays.asList(x-1,y,direction.get(dir)-1));
            }else{
                l2=new ArrayList(Arrays.asList(x+1,y,direction.get(dir)+1));
            }
            if(l2.get(0)>5||l2.get(0)<-5||l2.get(1)>5||l2.get(1)<-5){
                continue;
            }

            x=l2.get(0);
            y=l2.get(1);
            if(location.contains(l1)||location.contains(l2)){
                continue;
            }

            cnt++;
            location.add(l1);
            location.add(l2);

        }

        return cnt;

    }

}