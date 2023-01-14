import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList arr=new ArrayList();

        for(int i=0;i<my_string.length();i++){
            int value=Integer.valueOf(my_string.charAt(i))-'0';
            if(value>=0&&value<=9){
                arr.add(value);
            }
        }
        arr.sort(Comparator.naturalOrder());

        return arr;
    }
}