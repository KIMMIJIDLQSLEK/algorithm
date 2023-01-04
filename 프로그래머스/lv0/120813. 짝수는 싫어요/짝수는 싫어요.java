import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                l1.add(i);
            }
        }
        return l1;
    }
}