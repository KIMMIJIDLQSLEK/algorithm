class Solution {
    public int solution(int a, int b, int n) {

        int answer=0;

        while(true){
            int returnBottle=(n/a)*b;
            if(n<a){
                break;
            }

            answer+=returnBottle;
            n=returnBottle+n%a;

        }
        return answer;
    }
}