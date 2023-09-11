class Solution {
    
    public int[] solution(String[] park, String[] routes) {
        int[] answer=new int[2];

        int x=0;
        int y=0;
        boolean flag=false;
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park.length;j++){
                if(park[i].split("")[j].equals("S")){
                    x=j;
                    y=i;
                    flag=true;
                    break;
                }
                if(flag) break;
            }
        }
        int nx=x;
        int ny=y;
        //routes만큼 돌리기
        for(String route:routes){
            //방향만큼 FOR 문 돌려서 X 없으면 이동/ 있을 경우 break, 넘을 경우 break
            String dir=route.split("")[0];
            String num=route.split("")[2];

            boolean obstacle=false;
            for(int i=0;i<Integer.valueOf(num);i++){
                if(dir.equals("E")){
                    nx++;
                }
                else if(dir.equals("W")){
                    nx--;
                }
                else if(dir.equals("N")){
                    ny--;
                }
                else if(dir.equals("S")){
                    ny++;
                }
                if(ny<0||ny>=park.length||nx<0||nx>=park[0].length()||park[ny].split("")[nx].equals("X")){
                    ny=y;
                    nx=x;
                    obstacle=true;
                    break;
                }
            }
            if(!obstacle){
                x=nx;
                y=ny;
            }
        }

        answer[0]=y;
        answer[1]=x;

        return answer;

    }
}