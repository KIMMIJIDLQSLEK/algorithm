def alphabet(i,n):
    change=ord(i)+n
    if i==' ':
        return ' '
    elif i<='z' and i>='a': #소문자일경우
        if change>ord('z'):
            return chr(change-26)
        
    else:  #대문자일경우
        if change>ord('Z'):
            return chr(change-26)

    return chr(change)

def solution(s,n):
    answer=''
    for i in s:
        answer+=alphabet(i,n)

    return answer