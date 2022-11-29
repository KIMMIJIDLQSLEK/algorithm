def solution(brown, yellow):

    answer=[]
    for height in range(1,yellow+1):
        if yellow%height==0:
            width=yellow//height
        
        if brown==(width+height)*2+4:
            answer=[width+2,height+2]
            break;

    return answer

print(solution(24,24))