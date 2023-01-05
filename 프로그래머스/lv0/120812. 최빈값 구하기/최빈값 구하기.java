import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int lastIndex=array[array.length-1];

        int[] bucket=new int[lastIndex+1];
        for(int i=0;i<array.length;i++){
            bucket[array[i]]++;
        }

        int maxNum=-1;
        int maxIndex=0;
        for(int i=0;i<lastIndex+1;i++){
            if(maxNum<=bucket[i]){
                maxNum=bucket[i];
                maxIndex=i;
            }
        }

        for(int i=0;i<lastIndex+1;i++){
            if(maxNum==bucket[i] && maxIndex!=i){
                return -1;
            }
        }
        return maxIndex;
    }
}