def solution(d, budget):
    result = 0
    total = 0
    d.sort()

    for i in d:
        if total + i <= budget:
            total += i
            result += 1
    return result