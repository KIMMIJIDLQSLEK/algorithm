cnt_list=[]
def dfs(numbers,target,level,value):

    if level>=len(numbers):
        if value==target:
            cnt_list.append(1)

        return
    
    dfs(numbers,target,level+1,value+numbers[level])
    dfs(numbers,target,level+1,value-numbers[level])


def solution(numbers,target):

    dfs(numbers,target,0,0)
    return sum(cnt_list)