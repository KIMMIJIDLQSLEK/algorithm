import java.util.stream.IntStream;
class Solution {
    public double solution(int[] arr) {
        return (double)IntStream.of(arr).average().orElse(0);
    }
}