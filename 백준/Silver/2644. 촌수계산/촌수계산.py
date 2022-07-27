n=int(input())
a,b=map(int,input().split())
m=int(input())
graph=[[] for _ in range(n+1)]

visited=[]
def dfs(node,cnt):

    visited.append(node)

    if node==b:
        print(cnt)
        return 

    for adjacent_node in graph[node]:
        if adjacent_node not in visited:
            dfs(adjacent_node,cnt+1)




for _ in range(m):
    parent,child=map(int,input().split())
    graph[parent].append(child)
    graph[child].append(parent)


dfs(a,0)

if b not in visited:
    print(-1)