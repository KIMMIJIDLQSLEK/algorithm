#듣지못한 사람, 보지못한 사람 입력

listen,observe=map(int,input().split())

li_ob_person=[]
for _ in range(listen+observe):
    person=input()
    li_ob_person.append(person)

answer=[]
li_ob_person.sort()
for p in range(len(li_ob_person)-1):
    if li_ob_person[p]==li_ob_person[p+1]:
        answer.append(li_ob_person[p])


print(len(answer))
for i in answer:
    print(i)