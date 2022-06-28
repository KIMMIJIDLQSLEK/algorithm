n,m=map(int,input().split())
tree=list(map(int,input().split()))

def cut_tree(start,end):
    h=0
    while(start<=end):
        mid=(start+end)//2
        sum=0
        for tree_height in tree:
            if tree_height>mid:
                sum+=(tree_height-mid)
        if sum==m:
            return mid
        if sum>m:
            start=mid+1
            h=mid
        if sum<m:
            end=mid-1
    return h



print(cut_tree(0,max(tree)))