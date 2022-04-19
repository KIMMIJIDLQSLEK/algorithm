a,b,v=map(int,input().split())
distance=v-a
if distance%(a-b)!=0:
    day=distance//(a-b)+1
else:
    day=distance//(a-b)

print(day+1)