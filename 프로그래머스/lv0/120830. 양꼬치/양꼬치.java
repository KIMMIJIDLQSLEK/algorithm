class Solution {
    public int solution(int n, int k) {
        //양꼬치: n, 음료수: k
        //서비스받은 음료수: n/10
        return n*12000+(k-n/10)*2000;
    }
}