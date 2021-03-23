package Enumeration;

public class EnumExample {
    public enum Week {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};

    public static void main(String[] args) {
        for (Week day: Week.values())
            System.out.println(day);
    }
}
