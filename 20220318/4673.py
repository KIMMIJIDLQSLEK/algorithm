#1~10000까지 각자 더하는 걸로
total=set(range(1,10001)) #1~10001 의값을 중복허용하지 않는 set으로 선언
exist_num=set()  # 생성자가 있는 숫자 넣을 집합

#1부터 10000
for num in total:  #num이 764일경우
    for j in str(num):    #764를 str로 '7','6','4' 나눠 int로 변환시켜 더해줌
        num+=int(j)

    exist_num.add(num)

#생성자가 없는 숫자 가져오기= (1~10000 숫자)-(생성자가 있는 숫자)
#오름차순 정렬
self_num=sorted(total-exist_num)

#출력
for i in self_num:
    print(i)








# https://happyeuni.tistory.com/18
# https://ooyoung.tistory.com/64
# https://pybasall.tistory.com/92