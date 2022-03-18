#값 입력
#while문을 통해 값이 같을때까지 돌린다
#count값은 while돌릴때마다 ++

value=int(input())
count=0
result=value

while 1:
    a = result // 10
    b = result % 10
    ab = a + b
    if ab<10:
        result=b*10+ab

    else:
        result=b*10+(ab%10)

    count += 1

    if value is result:
        break



print(count)