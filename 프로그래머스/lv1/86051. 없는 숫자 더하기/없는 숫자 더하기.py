def solution(numbers):
    number_list=[0,1,2,3,4,5,6,7,8,9]
    
    sum=0
    for number in number_list:
        if not number in numbers:
            sum+=number
            
    return sum

