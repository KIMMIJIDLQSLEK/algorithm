import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer="";
        
        for(int i=0;i<a.length();i++){
            char alphabet=a.charAt(i);
            if(alphabet>='a' && alphabet<='z'){
                answer+=(char)(alphabet-('a'-'A'));
            }
            else{
                answer+=(char)(alphabet+('a'-'A'));
            }
        }
        System.out.println(answer);
    }
}