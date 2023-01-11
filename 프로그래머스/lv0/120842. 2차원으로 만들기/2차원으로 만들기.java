import java.util.ArrayList;
class Solution {
    public ArrayList solution(int[] num_list, int n) {
        int arrayLength=num_list.length/n;

        ArrayList arrayList=new ArrayList();
        for(int i=0;i<arrayLength;i++){
            ArrayList list=new ArrayList();
            for(int j=0;j<n;j++){
                list.add(num_list[i*n+j]);
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}