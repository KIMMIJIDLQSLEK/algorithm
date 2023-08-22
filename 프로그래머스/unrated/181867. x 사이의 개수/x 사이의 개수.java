class Solution {
    public int[] solution(String myString) {
        String[] str=myString.split("x");
        boolean flag=false;
        if(myString.endsWith("x")) flag=true;
        
        
        int[] answer;
        if(flag) answer=new int[str.length+1];
        else answer=new int[str.length];
        
        for(int i=0;i<str.length;i++){
            answer[i]=str[i].length();
        }
        return answer;
    }
}