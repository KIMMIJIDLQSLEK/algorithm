# 입력받은값 트리로 만들기
# 1. root, left child, right child 입력
# 2. 입력받은 값 list에 넣기
#트리순회
#1. 전위순회
#2. 중위순회
#3. 후위순회


tree_list=[0]*1000

preorder_list=[]
def preorder(idx):
    if tree_list[idx]=='.':
        return
    preorder_list.append(tree_list[idx])
    preorder(idx*2)
    preorder(idx*2+1)

Inorder_list=[]
def Inorder(idx):
    if tree_list[idx]=='.':
        return
    Inorder(idx*2)
    Inorder_list.append(tree_list[idx])
    Inorder(idx*2+1)

postorder_list=[]
def postorder(idx):
    if tree_list[idx]=='.':
        return
    postorder(idx*2)
    postorder(idx*2+1)
    postorder_list.append(tree_list[idx])


n=int(input())
tree_list[1]='A'
for i in range(1,n+1):
    p,lc,rc=map(str,input().split())
    p_index=tree_list.index(p,1)
    tree_list[p_index*2]=lc
    tree_list[p_index*2+1]=rc

# print(tree_list)

preorder(1)
Inorder(1)
postorder(1)
print(''.join(preorder_list))
print(''.join(Inorder_list))
print(''.join(postorder_list))


