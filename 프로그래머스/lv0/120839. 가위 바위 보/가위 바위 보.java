class Solution {
    public String solution(String rsp) {
        String winner="";

        for(int i=0;i<rsp.length();i++){
            char letter=rsp.charAt(i);
            if(letter=='2'){
                winner+="0";
            }else if(letter=='0'){
                winner+="5";
            }else{
                winner+="2";
            }

        }
        return winner;
    }
}