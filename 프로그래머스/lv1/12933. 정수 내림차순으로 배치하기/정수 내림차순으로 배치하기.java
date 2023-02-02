import java.util.*;

class Solution {
    public long solution(long n) {
        String[] str=Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        String s=String.join("",str);
        return Long.parseLong(s);
    }
}