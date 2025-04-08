package Collections;
// 2 task

public class Weekdays {

    public static void checkDay(Weekday day) {
        if (day.isHoliday()) {
            System.out.println(day + " is a holiday");
        } else {
            System.out.println(day + " is a weekday");
        }
    }

    public static void main(String[] args) {

        for (Weekday day : Weekday.values()) {
            checkDay(day);
        }
    }
}

