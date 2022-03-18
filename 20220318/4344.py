#테스트 케이스의 개수 c입력
#이중 for문
#리스트로 학생수의 성적추가
#첫번쨰 input: 학생수,for( 두번쨰 input: 학생수만큼의 성적)
#avg이용하여 학생의 성적 평균구하기
#학생수만큼 for문돌려서 평균보다 크면 count++, 작으면 넘기기
#학생수/count하여 퍼샌트구하기

c=int(input())
for i in range(c):
    sum=0
    num_grades=list(map(int,input().split()))
    count=0
    num=num_grades[0]

    for i in range(1,num+1):
        sum+=num_grades[i]

    avg=sum/num

    for grade in num_grades[1:num+1]:
        if grade>avg:
            count+=1

    result="{:.3f}%".format((count/num)*100)
    print(result)

#https://blockdmask.tistory.com/534
