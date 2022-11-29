def solution(d, budget):
    d.sort()

    cnt=0
    for i in d:
        if budget-i<0:
            break
        budget-=i
        cnt+=1

    return cnt
