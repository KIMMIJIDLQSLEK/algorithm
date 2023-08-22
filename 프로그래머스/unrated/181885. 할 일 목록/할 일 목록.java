class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        //배열로 풀기
        int cnt=0;
        for(int i=0;i<finished.length;i++){
            if(!finished[i]){
                cnt++;
            }
        }
        
        int index=0;
        String[] answer=new String[cnt];
        for(int i=0;i<finished.length;i++){
            if(!finished[i]) answer[index++]=todo_list[i];
        }
        
        return answer;
    }
}