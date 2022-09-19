from collections import deque

n=int(input())
stack=deque([])
command=deque([])
for _ in range(n):
    command.append(input().split())

while command:
    now_command=command.popleft()
    if now_command[0]=='push':
        stack.append(int(now_command[1]))

    elif now_command[0]=='top':
        if len(stack)!=0:
            print(stack[-1])
        else:
            print(-1)

    elif now_command[0]=='size':
        print(len(stack))

    elif now_command[0]=='empty':
        if len(stack)!=0:
            print(0)
        else:
            print(1)

    else:
        if len(stack)!=0:
            print(stack.pop())
        else:
            print(-1)

