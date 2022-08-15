#n보다 작은수들의 연속된 수로 표현하기
#n//2까지의 값만 비교하여 slicing(2중 for문)
#결과값 +1(자기 자신)

def solution(n):
    cnt=0
    for back in range(n//2+1,0,-1):
        # print(back)
        sum=back
        for slide in range(back-1,0,-1):
            sum+=slide

            if sum==n:
                cnt+=1
                break;
            elif sum>n:
                break;

    
    return cnt+1

