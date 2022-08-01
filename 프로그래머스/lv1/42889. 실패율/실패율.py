'''
1. 스테이지 N와 사용자의 현재 위치 stages 입력받음
2. for문으로 스테이지 N번 반복하며 현재 그 위치에 있는 사용자 cnt
3. 실패율 구한후 배열에 넣기
4. 정렬후 key값 리스트로 만들기
'''

def solution(N,stages): #(1)
    fail_percent={}
    total_stages=len(stages)
    for stage in range(1,N+1):  #(2)
        if total_stages!=0:
            stage_cnt=stages.count(stage)
            fail_percent[stage]=(stage_cnt/total_stages)  #(3)
            total_stages-=stage_cnt
        else:
            fail_percent[stage]=0

    return sorted(fail_percent,key=lambda x:fail_percent[x],reverse=True)  #(4)