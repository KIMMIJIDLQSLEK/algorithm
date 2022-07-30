#n입력
#n만큼 값 입력
#bfs
#for문 돌리며 1일경우 bfs로 들어가기

from collections import deque

n=int(input())

def bfs(graph,start_y,start_x):
    dy=[-1,1,0,0] #위, 아래, 왼, 오
    dx=[0,0,-1,1] 

    queue=deque([[start_y,start_x]])
    graph[start_y][start_x]='0'
    cnt=0

    while queue:
        cnt+=1
        y,x=queue.popleft()

        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]

            if all([nx>=0,nx<n,ny>=0,ny<n]):
                if graph[ny][nx]=='1':
                    queue.append([ny,nx])
                    graph[ny][nx]='0'

    return cnt



graph=[]
for _ in range(n):
    graph.append(list(input()))

result=[]
for y in range(n):
    for x in range(n):
        if graph[y][x]=='1':
            cnt=bfs(graph,y,x)
            result.append(cnt)


#출력
print(len(result))
for answer in sorted(result):
    print(answer)
