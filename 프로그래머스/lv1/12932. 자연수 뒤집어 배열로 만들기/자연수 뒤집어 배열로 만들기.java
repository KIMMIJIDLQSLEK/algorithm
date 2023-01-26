class Solution {
    public int[] solution(long n) {
        String[] nList=Long.toString(n).split("");
        int[] answer=new int[nList.length];
        
        for(int i=0;i<nList.length;i++){
            answer[i]=Integer.parseInt(nList[nList.length-1-i]);
        }
        return answer;
    }
}