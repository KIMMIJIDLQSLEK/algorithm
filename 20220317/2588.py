#입력값받기
a=int(input())
b=int(input())

#b의 자리수 저장하기
num1=b//100
num2=(b%100)//10
num3=(b%100)%10

# print(num1,num2,num3)

#a*b
print(a*num3)
print(a*num2)
print(a*num1)
print(a*b)
