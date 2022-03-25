value=int(input())
count=0

if value%5==0:
    count=value//5

else:
    mok=value//5
    namugi=value%5
    count=mok
    while mok>=0:
        if mok==0&namugi%3!=0:
            count=-1
            break
        if namugi%3==0:
           count+=(namugi//3)
           break
        else:
            mok-=1
            namugi+=5
            count-=1


print(count)
