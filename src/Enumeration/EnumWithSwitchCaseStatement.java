package Enumeration;

import java.util.Scanner;

enum Week {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class EnumWithSwitchCaseStatement {

    Week days;
    public EnumWithSwitchCaseStatement(Week days){
        this.days = days;
    }

    public void getMyWeekday(){
        switch (days){
            case SUNDAY -> {
                System.out.println("Sunday: First Day Of The Week");
                break;
            }
            case MONDAY -> {
                System.out.println("Monday:Second Day of The Week");
                break;
            }
            case TUESDAY -> {
                System.out.println("Tuesday:Third Day of The Week");
                break;
            }
            case WEDNESDAY -> {
                System.out.println("Wednesday: Fourth Day of The Week");
                break;
            }
            case THURSDAY -> {
                System.out.println("Thursday: Fifth Day Of The Week");
                break;
            }
            case FRIDAY -> {
                System.out.println("Friday: Sixth Day of The Week");
                break;
            }
            case SATURDAY -> {
                System.out.println("Saturdays: Seventh Day od The Week");
            }

        }
    }

    public static void main(String[] args) {
        EnumWithSwitchCaseStatement day1 = new EnumWithSwitchCaseStatement(Week.valueOf("SUNDAY") );
        day1.getMyWeekday();

        EnumWithSwitchCaseStatement day2 = new EnumWithSwitchCaseStatement(Week.valueOf("MONDAY"));
        day2.getMyWeekday();

        EnumWithSwitchCaseStatement day3 = new EnumWithSwitchCaseStatement(Week.valueOf("TUESDAY"));
        day3.getMyWeekday();

        EnumWithSwitchCaseStatement day4 = new EnumWithSwitchCaseStatement(Week.valueOf("WEDNESDAY"));
        day4.getMyWeekday();

        EnumWithSwitchCaseStatement day5 = new EnumWithSwitchCaseStatement(Week.valueOf("THURSDAY"));
        day5.getMyWeekday();

        EnumWithSwitchCaseStatement day6 = new EnumWithSwitchCaseStatement(Week.valueOf("FRIDAY"));
        day6.getMyWeekday();

        EnumWithSwitchCaseStatement day7 = new EnumWithSwitchCaseStatement(Week.valueOf("SATURDAY"));
        day7.getMyWeekday();

    }


}

