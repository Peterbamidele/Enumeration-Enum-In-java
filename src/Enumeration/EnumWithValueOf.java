package Enumeration;

public class EnumWithValueOf {
    public enum Week {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {
        for (Week day: Week.values()){
            System.out.println(day);
        }


        System.out.println("Value of Sunday is: "+ Week.valueOf("SUNDAY"));
        System.out.println("Index of Sunday is:"+Week.valueOf("SUNDAY").ordinal());

        System.out.println("Value of Monday is: "+ Week.valueOf("MONDAY"));
        System.out.println("Index of Monday is: "+ Week.valueOf("MONDAY").ordinal());

        System.out.println("Value of TUESDAY is: "+ Week.valueOf("TUESDAY"));
        System.out.println("Index of TUESDAY is: "+ Week.valueOf("TUESDAY").ordinal());

        System.out.println("Value of Wednesday is: "+ Week.valueOf("WEDNESDAY"));
        System.out.println("Index of Wednesday is: "+ Week.valueOf("WEDNESDAY").ordinal());

        System.out.println("Value of Thursday is: "+ Week.valueOf("THURSDAY"));
        System.out.println("Index of Thursday is: "+ Week.valueOf("THURSDAY").ordinal());

        System.out.println("Value of Friday is: "+ Week.valueOf("FRIDAY"));
        System.out.println("Index of Friday is: "+ Week.valueOf("FRIDAY").ordinal());

        System.out.println("Value of Saturday is: "+ Week.valueOf("SATURDAY"));
        System.out.println("Index of Saturday is: "+ Week.valueOf("SATURDAY").ordinal());

    }
}
