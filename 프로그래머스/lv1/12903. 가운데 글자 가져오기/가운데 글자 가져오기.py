def solution(s):
    mid=len(s)//2
    if len(s)%2: #홀수라면
        return s[mid]
    
    else: #짝수라면
        return s[mid-1:mid+1]