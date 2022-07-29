import sys
sys.setrecursionlimit(10**6)

test=int(input())

def dfs(graph,node,visited):
    
    if visited[node]==1:
        return 

    visited[node]=1
    dfs(graph,graph[node],visited)


result=[]
for _ in range(test):
    node_cnt=int(input())
    graph=[0]
    visited=[0]*(node_cnt+1)
    
    for i in list(map(int,input().split())):
        graph.append(i)
    
    cnt=0
    for start_node in range(1,node_cnt+1):
        if visited[start_node]==0:
            dfs(graph,start_node,visited)
            cnt+=1
    
    result.append(cnt)

for cnt in result:
    print(cnt)
