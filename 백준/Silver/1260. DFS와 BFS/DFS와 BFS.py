visited=[]
def dfs(graph,node):
    visited.append(node)
    print(node,end=' ')
    for adjacent_node in sorted(graph[node]):
        if adjacent_node not in visited:
            dfs(graph,adjacent_node)

def bfs(graph,node):
    queue=[node]
    visited=[node]
    while queue: #queue가 있을때까지
        current_node=queue.pop(0)
        print(current_node,end=' ')
        for adjacent_node in sorted(graph[current_node]):
            if adjacent_node not in visited:
                queue.append(adjacent_node)
                visited.append(adjacent_node)



n,m,v=map(int,input().split())
graph=[[] for _ in range(n+1)]

for _ in range(m):
    i,j=map(int,input().split())
    graph[i].append(j)
    graph[j].append(i)

dfs(graph,v)
print()
bfs(graph,v)