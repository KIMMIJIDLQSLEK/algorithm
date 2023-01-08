class Solution {
    public int solution(int hp) {
        int[] attack={5,3,1};
        int answer=0;

        for(int i=0;i<3;i++){
            answer+=hp/attack[i];
            hp%=attack[i];
        }
        return answer;
    }
}