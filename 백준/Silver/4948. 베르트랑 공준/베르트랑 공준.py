#123456*2의 값까지 소수 구하기
#입력값+1~입력값*2까지 사이의 소수값 구하기

import math

def sosu(num):
    for i in range(2,int(math.sqrt(num)+1)): #2,3은 소수로 들어감
        if num%i==0: #1과 자기자신말고 약수를 가짐(소수가 아닐경우)
            return False
    return True #소수일경우

sosu_list=list()
for num in range(2,123456*2+1): #2~12345*2까지의 소수구하기
    if sosu(num)==True:
        sosu_list.append(num)

while(1):
    n = int(input())
    if n==0:
        break
    else:
        count=0
        for sosu in sosu_list:
            if n<sosu<=2*n:
                count+=1
            elif sosu>2*n:
                break

        print(count)

