import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers) {
        return 45-IntStream.of(numbers).sum();
    }
}