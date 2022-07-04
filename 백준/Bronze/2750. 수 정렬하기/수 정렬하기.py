#입력
n=int(input())

input_list=[]
for i in range(n):
    value=int(input())
    input_list.append(value)

#선택정렬
for i in range(len(input_list)):
    min_index=i
    for j in range(i,len(input_list)):
        if input_list[min_index]>input_list[j]:
            min_index=j

    input_list[i],input_list[min_index]=input_list[min_index],input_list[i]

#출력
for num in input_list:
    print(num)

