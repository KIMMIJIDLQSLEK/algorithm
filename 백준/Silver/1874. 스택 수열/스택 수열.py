n=int(input())
sequence=[int(input()) for _ in range(n)]
index=0
now=1
stack=[]
answer=[]
while 1:
    if now>n+1:
        print("NO")
        exit()

    if stack and sequence[index]==stack[-1]: #스택에 값이 있고 sequence 순서대로 될경우
        stack.pop() 
        answer.append('-')
        index+=1
        if index==n and not stack:
            break;
        continue;
    else:
        stack.append(now)
        answer.append('+')
        now+=1


for a in answer:
    print(a)