class Solution {
    static int cnt = 0;

    public void threeFriend(int depth, int[] number, int[] visited, int value,int startIndex) {
        if (depth == 3) {
            if (value == 0) {
                cnt++;
            }
            return;
        }

        for (int i = startIndex; i < number.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                threeFriend(depth + 1, number, visited, value + number[i],i);
                visited[i] = 0;
            }
        }
    }

    public int solution(int[] number) {
        //3명의 학생 합=0일경우 삼총사
        //재귀로 풀기
        int[] visited = new int[number.length];
        threeFriend(0, number, visited, 0,0);

        return cnt;
    }
}