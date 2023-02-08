class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row=arr1.length;
        int col=arr2[0].length;
        int[][] result=new int[row][col];

        for(int y=0;y<row;y++){
            for(int x=0;x<col;x++)
            {
                
                int sum=0;
                for(int i=0;i<arr2.length;i++){
                    sum+=arr1[y][i]*arr2[i][x];
                }
                result[y][x]=sum;
            }
        }
        return result;
    }
}