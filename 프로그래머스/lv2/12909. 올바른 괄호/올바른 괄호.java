import java.util.*;
class Solution {
    boolean solution(String s) {
        //stack으로 닫힌 괄호 넣고 빼기
        //열린괄호면 Stack에 닫힌 괄호 넣기
        //닫힌괄호면 Stack에서 pop()하기

        Stack<String> close=new Stack();
        
        if(s.length()%2!=0){ //홀수 일경우
            return false;
        }
        
        for(char str:s.toCharArray()){
            if(str=='('){
                close.push(")");
            }else{
                if(close.isEmpty()){
                    return false;
                }
                close.pop();
            }
        }
        
        return close.isEmpty();
        
    }
}