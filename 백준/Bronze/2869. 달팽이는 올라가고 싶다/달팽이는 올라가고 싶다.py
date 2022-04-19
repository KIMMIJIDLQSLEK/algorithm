#한번에 계산하기

a,b,v=map(int,input().split())
if v==a:
    day=0
else:
    day=1

if v-a<=a-b:
        day+=1
else:
    if (v-a)%(a-b)==0: #정확히 나누어 떨어진다면
        day+=(v-a)//(a-b)
    else: #나누어 떨어지지않는다면
        day+=(v-a)//(a-b)+1

print(day)