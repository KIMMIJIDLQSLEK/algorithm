#bfs
#n,m,k 입력
#k만큼 반복하여 음식물 좌표 입력
#bfs이용하여 음식물 크기 확인후 size return
from collections import deque


n,m,k=map(int,input().split())
graph=[[0]*(m+1) for _ in range(n+1)]
garbage=[]
for _ in range(k):
    r,c=map(int,input().split())
    graph[r][c]=1
    garbage.append([r,c])


def bfs(y,x,size):
    dy=[-1,1,0,0] #위, 아래, 왼, 오
    dx=[0,0,-1,1]

    queue=deque([[y,x]])
    graph[y][x]=0

    while queue:
        y,x=queue.popleft()
        
        size+=1

        for i in range(4):
            ny=y+dy[i]
            nx=x+dx[i]

            if all([ny>=1,nx>=1,ny<=n,nx<=m]):
                if graph[ny][nx]==1:
                    graph[ny][nx]=0
                    queue.append([ny,nx])
                    
    return size


max=0
for garbage_y,garbage_x in garbage:
    if graph[garbage_y][garbage_x]==1:
        return_size=bfs(garbage_y,garbage_x,0)

    if return_size>max:
        max=return_size
        

print(max)

