dp={}
def w(a,b,c):
    if any([a<=0, b<=0,c<=0]):
        return 1

    if any([a>20, b>20 ,c>20]):
        return w(20,20,20)
    

    if all([a<b,b<c]):
        if not dp.get(f'{a},{b},{c}'):
            dp[f'{a},{b},{c}']= w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c)

        return dp[f'{a},{b},{c}']

    else:
        if not dp.get(f'{a},{b},{c}'):
            dp[f'{a},{b},{c}']= w(a-1,b,c)+w(a-1,b-1,c)+w(a-1,b,c-1)-w(a-1,b-1,c-1)

        return dp[f'{a},{b},{c}']

while 1:
    a,b,c=map(int,input().split())
    if all([a==-1, b==-1, c==-1]):
        break;
    result=w(a,b,c)
    print(f'w({a}, {b}, {c}) = {result}')
