class Solution {
    public int solution(String my_string) {
        int answer = 0;
            for(int i=0;i<my_string.length();i++){
            int value=Integer.valueOf(my_string.charAt(i))-'0';
            if(value>0 && value<=9){
                answer+=value;
            }
        }
        return answer;
    }
}