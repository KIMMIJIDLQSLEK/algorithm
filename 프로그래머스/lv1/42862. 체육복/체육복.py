def solution(n,lost,reverse):
    
    new_lost=set(lost)-set(reverse) #set의 차집합 허용
    new_reverse=set(reverse)-set(lost)

    participants=n-len(new_lost)

    for clothes in sorted(new_lost):
        if clothes-1 in new_reverse:
            new_reverse.remove(clothes-1)
            participants+=1
        elif clothes+1 in new_reverse:
            new_reverse.remove(clothes+1)
            participants+=1
        
    return participants