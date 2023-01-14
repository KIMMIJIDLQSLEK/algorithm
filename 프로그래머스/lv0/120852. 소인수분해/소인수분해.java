import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        //set 형으로 소수 저장(1을 제외)
        //값 나눠질 경우 n/i로 n을 저장후 i=2를 저장하여 2부터 다시 시작
        //값 나눠지지 않을 경우 i를 증가
        HashSet result=new HashSet<>();

        int i=2;
        while(i<=n){
            if(n%i==0){
                result.add(i);
                n/=i;
                i=2;
            }else{
                i++;
            }
        }

        ArrayList answer=new ArrayList(result);
        answer.sort(Comparator.naturalOrder());

        return answer;


    }
}