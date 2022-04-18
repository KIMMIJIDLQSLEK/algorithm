#n,m입력
#n만큼 숫자입력
#각각 숫자 세개를 골라 더하며 m보다 작은 값일경우 count+1

n,m=map(int,input().split())
card=list(map(int,input().split()))
maxx=0

for i in range(len(card)-2):
    for j in range(i+1,len(card)-1):
        for k in range(j+1,len(card)):
            result=card[i]+card[j]+card[k]
            if result<=m and result>maxx:
                    maxx=result
print(maxx)

