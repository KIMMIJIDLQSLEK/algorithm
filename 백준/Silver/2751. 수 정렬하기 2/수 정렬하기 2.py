#병합
def merge(array1,array2):
    array1_len=len(array1)
    array2_len=len(array2)
    index1=0
    index2=0
    result=[]
    while(index1<array1_len and index2<array2_len):
        if array1[index1]<=array2[index2]:
            result.append(array1[index1])
            index1+=1
        else:
            result.append(array2[index2])
            index2+=1

    if index1==array1_len:
        result+=array2[index2:]

    if index2==array2_len:
        result+=array1[index1:]
    
    return result

#분할
def merge_sort(array):
    if len(array)<=1:
        return array

    mid=len(array)//2
    array1=merge_sort(array[:mid])
    array2=merge_sort(array[mid:])

    return merge(array1,array2)


#입력
n=int(input())

input_list=[]
for i in range(n):
    num=int(input())
    input_list.append(num)

#병합정렬
answer=merge_sort(input_list)

#출력
for num in answer:
    print(num)