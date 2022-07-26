#dfs
#test개수 test입력
#가로,세로,위치의 개수 m,n,k입력
#k번만큼 반복하여 위치 입력
#dfs사용하여 최소 지렁이 개수 리스트에 담기(result)
#출력


#dfs
def dfs(graph,x,y):
    dx=[0,0,-1,1]
    dy=[-1,1,0,0]
    
    graph[y][x]=2 #방문했다는 표시

    for i in range(4):
        nx=x+dx[i]
        ny=y+dy[i]

        if all([nx>=0 , nx<m , ny>=0 , ny<n]):
            if graph[ny][nx]==1:
                dfs(graph,nx,ny)


#입력
test=int(input())
result=[]
for _ in range(test):
    m,n,k=map(int,input().split())
    graph=[[0]*m for _ in range(n)]
    carraige=[]
    for _ in range(k):
        x,y=map(int,input().split())
        graph[y][x]=1
        carraige.append([x,y])
    
    cnt=0
    for x,y in carraige:
        if graph[y][x]==1:
            dfs(graph,x,y)
            cnt+=1

    result.append(cnt) 

#출력
for result_cnt in result:
    print(result_cnt)
