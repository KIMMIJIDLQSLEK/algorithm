import java.util.ArrayList;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] arrayList=new int[num_list.length/n][n];

        for(int i=0;i<num_list.length/n;i++){
            for(int j=0;j<n;j++){
                arrayList[i][j]=num_list[i*n+j];
            }
        }
        return arrayList;
    }
}