# 1.입력받은값 트리로 만들기
#  1-1. root, left child, right child 입력
#  1-1. 입력받은 값 list에 넣기
# 2. 트리순회
#  2-1. 전위순회
#  2-2. 중위순회
#  2-3. 후위순회


tree_list=[0]*1000

preorder_path=[]
def preorder(idx):
    if tree_list[idx]=='.':
        return
    preorder_path.append(tree_list[idx])
    preorder(idx*2)
    preorder(idx*2+1)

inorder_path=[]
def inorder(idx):
    if tree_list[idx]=='.':
        return
    inorder(idx*2)
    inorder_path.append(tree_list[idx])
    inorder(idx*2+1)

postorder_path=[]
def postorder(idx):
    if tree_list[idx]=='.':
        return
    postorder(idx*2)
    postorder(idx*2+1)
    postorder_path.append(tree_list[idx])


n=int(input())
tree_list[1]='A'
for i in range(1,n+1):
    parent,left_child,right_child=input().split()
    p_index=tree_list.index(parent,1)
    tree_list[p_index*2]=left_child
    tree_list[p_index*2+1]=right_child

preorder(1)
inorder(1)
postorder(1)
print(''.join(preorder_path))
print(''.join(inorder_path))
print(''.join(postorder_path))