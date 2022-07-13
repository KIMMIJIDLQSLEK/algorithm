n,m=map(int,input().split())
miro=[]

for i in range(n):
    miro.append(list(map(int,input())))

#bfs
def BFS(y,x):
    dx=[-1,1,0,0] #왼,오,위,아래
    dy=[0,0,-1,1] #왼,오,위,아래
    queue=[]
    queue.append([y,x])
    while queue: #queue가 있을경우
        y,x=queue.pop(0)
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if nx<0 or ny<0 or nx>=m or ny>=n:
                continue;
            if miro[ny][nx]==0:
                continue;
            if miro[ny][nx]==1:
                queue.append([ny,nx])
                miro[ny][nx]=miro[y][x]+1

    return miro[n-1][m-1]

#출발위치
print(BFS(0,0))
