class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s);
        
        int strNum=my_string.length()-s;
        if(strNum==overwrite_string.length()){
            return answer+overwrite_string;
        }else if(strNum>overwrite_string.length()){
            return answer+overwrite_string+my_string.substring(s+overwrite_string.length(),my_string.length());
            
        }
        else{
            return answer+overwrite_string.substring(strNum);
        }
      }
}