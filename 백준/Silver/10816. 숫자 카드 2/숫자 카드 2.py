n=int(input())
n_card={}
n_input=list(map(int,input().split()))
for ncard in n_input:
    if n_card.get(ncard):
        n_card[ncard].append(1)
    else:
        n_card[ncard]=[1]

m=int(input())
m_card=list(map(int,input().split()))

answer=[]
for mcard in m_card:
    if n_card.get(mcard):
        answer.append(len(n_card[mcard]))
    else:
        answer.append(0)

for a in answer:
    print(a, end=' ')
