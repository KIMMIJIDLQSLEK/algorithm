import java.util.*;
class Solution {
    //방향(위,오,아래,왼)
    int[] dx={0,1,0,-1};
    int[] dy={-1,0,1,0};
    //map
    char[][] map;
    boolean[][] visited;


    //노드 클래스(x,y,level)
    class Pos{
        int x,y;
        int level;

        public Pos(int x, int y, int level){
            this.x=x;
            this.y=y;
            this.level=level;
        }

    }
    public int bfs(int startX,int startY, int endX,int endY){
        visited=new boolean[map.length][map[1].length];
        Queue<Pos> queue=new LinkedList<>();
        queue.add(new Pos(startX,startY,0));


        while(!queue.isEmpty()){
            Pos now=queue.poll();
            visited[now.y][now.x]=true;

            if(now.x==endX && now.y==endY){
                return now.level;
            }

            for(int i=0;i<4;i++){
                int nx=now.x+dx[i];
                int ny=now.y+dy[i];

                if(nx<0||nx>=map[0].length||ny<0||ny>=map.length){
                    continue;
                }else if(map[ny][nx]=='X'|| visited[ny][nx]==true){
                    continue;
                }

                visited[ny][nx]=true;
                queue.add(new Pos(nx,ny,now.level+1));
            }
        }

        return -1;
    }

   public int solution(String[] maps) {
        //map선언 / S, L, E 값 찾기
        map=new char[maps.length][maps[0].length()];
        int startX=0,startY=0;
        int levarX=0,levarY=0;
        int endX=0,endY=0;

        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[1].length();j++){
                map[i][j]=maps[i].charAt(j);

                if(map[i][j]=='S') {
                    startX=j;
                    startY=i;
                }
                if(map[i][j]=='L') {
                    levarX=j;
                    levarY=i;
                }
                if(map[i][j]=='E') {
                    endX=j;
                    endY=i;
                }
            }
        }

        //BFS /S->L
        int answer=bfs(startX,startY,levarX,levarY);

        //레버 찾음
        if(answer>-1){
            int num=bfs(levarX,levarY,endX,endY);
            if(num>-1){
                return answer+num;
            }
            return -1;
        }
        return -1;


    }


}