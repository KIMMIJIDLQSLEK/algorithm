#n입력
#n만큼 입력
#for문 돌리며 O일경우 cnt+1 후 sum 더하기/X일경우 cnt=0으로 갱신

n=int(input())
ox_list=list(input() for _ in range(n))

for i in range(n):
    cnt=0
    sum=0
    for now in ox_list[i]:
        if now=='O':
            cnt+=1
            sum+=cnt
        else:
            cnt=0
    print(sum)
