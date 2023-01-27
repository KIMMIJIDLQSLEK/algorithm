import java.util.*;

class Solution {
    public ArrayList solution(int[] answers) {
        int[] person1={1,2,3,4,5};
        int[] person2={2,1,2,3,2,4,2,5};
        int[] person3={3,3,1,1,2,2,4,4,5,5};
        
        int[] cnt=new int[3];
        
        for(int i=0;i<answers.length;i++){
            if(person1[i%5]==answers[i]){
                cnt[0]++;
            }
            if(person2[i%8]==answers[i]){
                cnt[1]++;
            }
            if(person3[i%10]==answers[i]){
                cnt[2]++;
            }
        }
        
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            if(maxx<cnt[i]){
                maxx=cnt[i];
            }
        }
        
        ArrayList answer=new ArrayList();
        for(int i=0;i<3;i++){
            if(maxx==cnt[i]){
                answer.add(i+1);
            }
        }
        
    
        return answer;
    }
}