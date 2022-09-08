answer=[]
def hanoi(n,start,end,mid):  #맨아래 기준
    if n==1:
        answer.append([start,end])  #이동한 과정
        return
    
    hanoi(n-1,start,mid,end)  #(1)n-1기준 출발위치와 도착위치 지정
    answer.append([start,end])  #(2)
    hanoi(n-1,mid,end,start) #(3)



def solution(n):
    hanoi(n,1,3,2)
    return answer