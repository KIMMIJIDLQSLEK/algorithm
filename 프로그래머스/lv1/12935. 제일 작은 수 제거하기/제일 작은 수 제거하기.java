class Solution {
    public int[] solution(int[] arr) {
        /*
        1. arr의 길이>1일경우 answer[arr.size-1]
        1-1. min값 찾기
        1-2. min값이 아닌 경우에만 answer에 넣기
        2. arr의 길이=1인경우 answer에 -1
        */
        
        int[] answer={-1};  //todo 2.
        if(arr.length>1){
            //todo: 1. 
            answer=new int[arr.length-1];
            
            //todo: 1-1. 
            int minVal=Integer.MAX_VALUE;
            for(int item:arr){
                if(item<minVal){
                    minVal=item;
                }
            }

            //todo: 1-2. 
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