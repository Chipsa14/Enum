package homework;

public class Enum {
    enum Monsdays {
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);

        int mons;

        Monsdays(int mons) {
            this.mons = mons;
        }
    }
        public static void HowDayInMoths(Monsdays monsdays) {
            System.out.println("The Month  " + monsdays.name() + " has: " + monsdays.mons +" days");
        }

    public static void main(String[] args) {
        Monsdays monsdays = Monsdays.DECEMBER;
        HowDayInMoths(monsdays);
    }
}
