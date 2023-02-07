import java.util.*;

class Solution {
    public boolean check(String str){
        HashMap<String,String> map=new HashMap(){{
            put("{","}");
            put("[","]");
            put("(",")");
        }};
        Stack<String> stack=new Stack();

        for(int i=0;i<str.length();i++){
            String s=Character.toString(str.charAt(i));
            if(map.containsKey(s)){
                stack.push(map.get(s));
            }else{
                if(stack.size()==0) return false;
                if(!s.equals(stack.pop())){
                    return false;
                }
            }

        }
        return stack.size()==0;
    }
    public int solution(String s) {
        int cnt=0;
        String[] list=s.split("");
        for(int i=0;i<s.length();i++){
            String str=s.substring(i)+s.substring(0,i);
            if(check(str)){
                cnt++;
            }
        }
        return cnt;

    }
}