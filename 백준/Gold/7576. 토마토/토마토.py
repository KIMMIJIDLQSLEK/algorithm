from collections import deque

#bfs
def bfs(graph):
    queue=deque([])
    dx=[0,0,-1,1] #위, 아래, 왼 오
    dy=[-1,1,0,0]
    for y in range(n):
        for x in range(m):
            if graph[y][x]==1:
                queue.append([y,x])

    while queue:
        y,x=queue.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if nx<0 or nx>=m or ny<0 or ny>=n:
                continue;
            if graph[ny][nx]==-1:
                continue;
            if graph[ny][nx]==0:
                graph[ny][nx]=graph[y][x]+1
                queue.append([ny,nx])
    

#m,n입력
m,n=map(int,input().split()) #가로, 세로
#graph입력
graph=[list(map(int,input().split())) for _ in range(n)]

bfs(graph)

max=0
flag=0
for y in range(n):
    for x in range(m):
        if graph[y][x]==0:
            flag=-1
            break;
        if max<graph[y][x]:
            max=graph[y][x]
    if flag==-1:
        break;

if flag==-1:
    print(flag)
else:
    print(max-1)
