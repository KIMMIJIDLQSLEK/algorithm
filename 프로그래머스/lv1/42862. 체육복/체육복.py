def solution(n,lost,reverse):
    participants=n-len(lost)
    
    new_lost=list(lost-reverse)
    new_reverse=list(reverse-lost)

    for clothes in sorted(new_lost):
        if clothes-1 in new_reverse:
            new_reverse.remove(clothes-1)
            participants+=1
        elif clothes+1 in new_reverse:
            new_reverse.remove(clothes+1)
            participants+=1
        
    return participants
