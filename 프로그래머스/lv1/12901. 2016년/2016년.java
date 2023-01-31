import java.time.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate date=LocalDate.of(2016,a,b);
        int dayOfWeek=date.getDayOfWeek().getValue();
        
        String[] day={"","MON","TUE","WED","THU","FRI","SAT","SUN"};
        return day[dayOfWeek];
    }
}