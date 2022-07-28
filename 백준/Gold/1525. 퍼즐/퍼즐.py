#bfs
from collections import deque
answer="123456780"


def bfs(puzzle):
    dx = [-1, 0, 1, 0] 
    dy = [0, 1, 0, -1]
    
    queue=deque([[puzzle,0]])
    visited={puzzle:1}

    while queue:
        now_puzzle,cnt=queue.popleft()

        if now_puzzle == answer:
            return cnt

        zero_index=now_puzzle.index('0')
        y=zero_index//3
        x=zero_index%3

        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]

            if all([nx>=0,nx<3,ny>=0,ny<3]):
                now_puzzle_list=list(now_puzzle)
                now_puzzle_list[zero_index],now_puzzle_list[ny*3+nx]=now_puzzle_list[ny*3+nx],now_puzzle_list[zero_index]
                next_puzzle=''.join(now_puzzle_list)
                if not visited.get(next_puzzle):  #list안하면 오래걸림/ dictionary의 시간복잡도는 상수이므로 시간이 적게 걸림
                    visited[next_puzzle]=1
                    queue.append([next_puzzle,cnt+1])

    return -1

puzzle=''
for _ in range(3):
    puzzle+=input().replace(' ','')

zero_index=puzzle.index('0')

result=bfs(puzzle)
print(result)
