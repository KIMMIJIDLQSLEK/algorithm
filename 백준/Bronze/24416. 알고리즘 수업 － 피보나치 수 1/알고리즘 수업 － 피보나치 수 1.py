#재귀
cnt1=1
def fib(n):
    global cnt1
    if n==1 or n==2:
        return 1
    else:
        cnt1+=1
        return fib(n-1)+fib(n-2)


#동적 프로그래밍
def fibonacci(n):
    cnt2=0
    fibonacci=[0]
    fibonacci.append(1)
    fibonacci.append(1)

    for i in range(3,n+1):
        cnt2+=1
        fibonacci.append(fibonacci[i-1]+fibonacci[i-2])

    return cnt2

n=int(input())
fib(n)
print(f'{cnt1} {fibonacci(n)}')

