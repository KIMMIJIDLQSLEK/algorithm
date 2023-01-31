class Solution {
    public int solution(String s) {
        String[] Estring={"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0;i<Estring.length;i++){
            s=s.replace(Estring[i],Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}