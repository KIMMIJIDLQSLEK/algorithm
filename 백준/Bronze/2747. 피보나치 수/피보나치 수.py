fibonacci_list=[0,1]

def fibonacci(n):
    for i in range(2,n+1):
        fibonacci_list.append(fibonacci_list[i-1]+fibonacci_list[i-2])
    
    return fibonacci_list[n]

n=int(input())
print(fibonacci(n))