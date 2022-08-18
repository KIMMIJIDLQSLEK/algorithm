n=int(input())

i=1 
num=0
while True:
    if num+i<n: 
        num+=i
        i+=1
    else:
        break;

#짝수인지 홀수인지에 따라 시작이 다름
if i%2!=0:  #홀수라면
    for denominator in range(1,i+1):
        num+=1
        if num==n:
            print(f"{(i+1)-denominator}/{denominator}")
            break
       
           
else:    #짝수라면
    for denominator in range(i,0,-1):
        num+=1
        if num==n:
            print(f"{(i+1)-denominator}/{denominator}")
            break
        
