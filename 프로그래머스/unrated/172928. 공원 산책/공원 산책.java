class Solution {
    String dir="NSEW"; //위,아래,오,왼
    int[] dx={0,0,1,-1};
    int[] dy={-1,1,0,0,};
    public int[] solution(String[] park, String[] routes) {
        int[] answer=new int[2];
        
        //park를 새로운 배열로 만들고 S의 X,Y값을 구한다.
        char[][] parkArray=new char[park.length][park[0].length()];
        int x=0,y=0;
        
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[0].length();j++){
                parkArray[i][j]=park[i].charAt(j);
                
                if(parkArray[i][j]=='S'){
                    y=i;
                    x=j;
                }
            }
        }
        
        //ROUTES를 돌려 시작값에서 출발
        for(String route:routes){
            String op=route.split("")[0];
            int n=Integer.parseInt(route.split("")[2]);
            
            int nx=x;
            int ny=y;
            
            boolean flag=true;
            
            //FOR문을 돌려 확인 후 장애물 또는 방어벽 없을 경우 이동완료/ 있을 경우 BREAK;
            for(int i=0;i<n;i++){
                nx+=dx[dir.indexOf(op)];
                ny+=dy[dir.indexOf(op)];
                
                if(nx<0 || nx>=parkArray[0].length || ny<0 ||ny>=parkArray.length ||parkArray[ny][nx]=='X'){
                    flag=false;
                    break;
                }
            }
            if(flag){
                x=nx;
                y=ny;
            }
        }
        
        answer[0]=y;
        answer[1]=x;
        
        return answer;
    }
    
}