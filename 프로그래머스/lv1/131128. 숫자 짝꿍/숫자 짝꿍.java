class Solution {
    public int[] bucket(String s){
        int[] bucketCnt=new int[10];
        for(String c:s.split("")){
            bucketCnt[Integer.parseInt(c)]++;
        }
        return bucketCnt;
    }
    public String solution(String X, String Y) {
        //짝꿍이 없을 경우 -1
        //짝꿍이 있을 경우 가장 큰 수 만들기
        String answer="";
        int[] bucketX=bucket(X);
        int[] bucketY=bucket(Y);

        for(int i=9;i>=0;i--){
            int minvalue=0;
            if(bucketX[i]>bucketY[i]){
                minvalue=bucketY[i];
            }else{
                minvalue=bucketX[i];
            }
            String str=Integer.toString(i);
            
            answer+=str.repeat(minvalue);
        }

        if(answer.equals("")){
            return "-1";
        }
        
        if(answer.charAt(0)=='0'){
            return "0";
        }

        return answer;
    }
}