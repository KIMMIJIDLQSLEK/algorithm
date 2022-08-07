from collections import deque

def solution(arr):
    queue=deque(arr)

    answer=[arr[0]]
    while queue:
        num=queue.popleft()
        if answer[-1]!=num:
            answer.append(num)

    return answer
