def solution(arr1, arr2):
    answer=[]
    for i in range(len(arr1)):
        value=[]
        for j in range(len(arr1[i])):
            value.append(arr1[i][j]+arr2[i][j])
        answer.append(value)
            
    return answer