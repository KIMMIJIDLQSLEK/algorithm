def solution(nums):
    pocketmon_dict={}
    for pocketmon in nums:
        if not pocketmon_dict.get(pocketmon):
            pocketmon_dict[pocketmon]=1
        else:
            pocketmon_dict[pocketmon]+=1

    if len(pocketmon_dict)>(len(nums)//2):
        return len(nums)//2
    else:
        return len(pocketmon_dict)
