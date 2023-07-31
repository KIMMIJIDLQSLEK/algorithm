class Solution {
    public int[] solution(int start, int end) {
        int[] answer=new int[end-start+1];
        
        int value=start;
        for(int i=0;i<=end-start;i++){
            answer[i]=value++;
        }
        
        return answer;
    }
}