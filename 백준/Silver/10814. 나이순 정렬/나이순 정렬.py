n=int(input())

join=[]
for _ in range(n):
    join.append(list(input().split()))

join.sort(key=lambda x: int(x[0]))

for age,name in join:
    print(age, name)
