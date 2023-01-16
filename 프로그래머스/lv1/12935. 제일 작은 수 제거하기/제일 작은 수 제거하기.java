class Solution {
    public int[] solution(int[] arr) {
        /*
        arr의 길이>1일경우 answer[arr.size-1]
        min값 찾은 후 min값이 아닌 값이면 answer에 넣기
        arr의 길이=1인경우 answer에 -1
         */
        int[] answer={-1};
        if(arr.length>1){
            answer=new int[arr.length-1];

            int minVal=Integer.MAX_VALUE;
            for(int item:arr){
                if(item<minVal){
                    minVal=item;
                }
            }

            int idx=0;
            for(int item:arr){
                if(item!=minVal){
                    answer[idx++]=item;
                }
            }
        }
        return answer;
    }
}