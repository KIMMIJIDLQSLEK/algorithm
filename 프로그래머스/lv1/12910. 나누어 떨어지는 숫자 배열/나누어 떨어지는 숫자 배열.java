import java.util.*;
class Solution {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList list=new ArrayList();
        Arrays.sort(arr);
        
        for(int a:arr){
            if(a%divisor==0){
                list.add(a);
            }
        }
        
        if(list.size()==0){
            list.add(-1);
        }
    
        
        return list;
    }
}