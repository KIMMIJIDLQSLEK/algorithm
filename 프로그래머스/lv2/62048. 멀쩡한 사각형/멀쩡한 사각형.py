def solution(w, h):
    answer = 0
    for i in range(min(w, h), 0, -1):
        if w % i == 0 and h % i == 0:
            answer = i
            break
    result=w*h-(w+h-answer)
    return result