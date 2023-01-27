import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1={1,2,3,4,5};
        int[] person2={2,1,2,3,2,4,2,5};
        int[] person3={3,3,1,1,2,2,4,4,5,5};
        
        int[] grade=new int[3];
        
        for(int i=0;i<answers.length;i++){
            if(person1[i%5]==answers[i]){
                grade[0]++;
            }
            if(person2[i%8]==answers[i]){
                grade[1]++;
            }
            if(person3[i%10]==answers[i]){
                grade[2]++;
            }
        }
        
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            if(maxx<grade[i]){
                maxx=grade[i];
            }
        }
        
        ArrayList<Integer> answer=new ArrayList();
        for(int i=0;i<3;i++){
            if(maxx==grade[i]){
                answer.add(i+1);
            }
        }
        
       return answer.stream().mapToInt(i->i.intValue()).toArray();

    }
}