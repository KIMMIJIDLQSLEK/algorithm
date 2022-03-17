h,m=map(int,input().split())

mm=m-45

if mm>=0:
    print(h,mm)
else:
    if h-1<0:
        print(23,60+mm)
    else:
        print(h-1,60+mm)