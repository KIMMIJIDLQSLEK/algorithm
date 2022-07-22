def bfs(graph,node):
    queue=[node]
    visited=[node]
    cnt=0
    while queue:
        current_node=queue.pop(0)
        for adjacent_node in graph[current_node]:
            if adjacent_node not in visited:
                visited.append(adjacent_node)
                queue.append(adjacent_node)
                cnt+=1
    
    return cnt

computer=int(input())
line=int(input())
graph=[[] for _ in range(computer+1)]

for _ in range(line):
    i,j=map(int,input().split())
    graph[i].append(j)
    graph[j].append(i)


print(bfs(graph,1))