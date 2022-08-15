#nums 정렬
#3개로 더할 수 있는 모든 값 구하기
#구한 값이 소수인지 확인
#방법: 3중 for문, dfs

def solution(nums):
    cnt=0

    for i in range(0,len(nums)-2):
        for j in range(i+1,len(nums)-1):
            for k in range(j+1,len(nums)):
                sum=nums[i]+nums[j]+nums[k]
                sosu=True
                for z in range(2,sum//2):
                    if sum%z==0:
                        sosu=False
                        break;
                if sosu:
                    cnt+=1

                    
    return cnt