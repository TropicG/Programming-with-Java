package enums;

import java.util.Arrays;

public class DayExample {

    private Day day;

    public DayExample(Day day){
        this.day = day;
    }

    public static void main(String[] args) {

        DayExample example = new DayExample(Day.TUESDAY);
        example.tellItLikeItis(); // souts midweek days are so-so

        Day[] days = Day.values();
        System.out.println(Arrays.toString(days));

        System.out.println(Day.valueOf("MONDAY"));
        System.out.println(Day.MONDAY.getAbbreviation());

    }

    public void tellItLikeItis(){
        String message = switch(day){
          case MONDAY -> "Mondays are boring";
          case FRIDAY -> "Fridays are better.";
          case SATURDAY, SUNDAY -> "Weekends are best.";
            default -> "Midweek days are so-so.";
        };

        System.out.println(message);
    }
}
