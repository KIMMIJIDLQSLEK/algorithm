class Solution {
    public int solution(String s) {
        //s를 " "로 구분하여 리스트로 만들기
        //for문을 통해 sum값을 구하며
        //Z일경우 이전의 값 빼기

        String[] li=s.split(" ");
        int answer=0;

        for(int i=0;i<li.length;i++){
            if(li[i].equals("Z")){
                answer-=Integer.valueOf(li[i-1]);
            }else{
                answer+=Integer.valueOf(li[i]);
            }

        }

        return answer;
    }
}