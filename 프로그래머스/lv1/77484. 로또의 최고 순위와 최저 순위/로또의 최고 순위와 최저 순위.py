def rank(num):
    rank_list=[6,6,5,4,3,2,1]
    return rank_list[num]

def solution(lottos, win_nums):
    cnt=0
    zero=0
    for lotto in lottos:
        if lotto==0:
            zero+=1
        if lotto in win_nums:
            cnt+=1
    max=cnt+zero
    min=cnt
    
            
    return [rank(max),rank(min)]