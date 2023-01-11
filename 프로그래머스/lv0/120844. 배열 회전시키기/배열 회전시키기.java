import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] numbers, String direction) {
        ArrayList arrayList=new ArrayList<>();
        if(direction.equals("right")){
            arrayList.add(numbers[numbers.length-1]);
            for(int i=0;i<numbers.length-1;i++){
                arrayList.add(numbers[i]);
            }
        }else{
            for(int i=1;i<numbers.length;i++){
                arrayList.add(numbers[i]);
            }
            arrayList.add(numbers[0]);
        }

        return arrayList;

    }
}