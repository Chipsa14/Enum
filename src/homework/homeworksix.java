package homework;

import java.util.Scanner;

public class homeworksix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int even = scanner.nextInt();
        isEven(even);

        System.out.println("Введите год");
        int year = scanner.nextInt();
        boolean leap = isYearLeap(year);
        if (leap) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");
        }


        System.out.println("Введите оценку");
        int gra = scanner.nextInt();
        System.out.println(grade(gra));

        System.out.println("Введите месяц ");
        String monts = scanner.nextLine();
        System.out.println(season(monts));
    }

    public static void isEven (int x){
        int num = x % 2;
        boolean isEven = num == 0;
        if (isEven){
            System.out.println("Введенное число четное");
        }else {
            System.out.println("Введенное число нечетное");
        }
    }



    public static boolean isYearLeap(int x) {
        if (x % 4 == 0) {
            if (x % 100 == 0) {
                if (x % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }


public static String grade (int x){
        if (90<=x && x <= 100){
            return "A";
        }else if (80 <= x && x <= 89){
            return "B";
        }else  if (70 <= x && x <=79){
            return "C";
        }else if (60 <= x && x <= 69){
            return "В";
        }else
            return "F";
}


public static String season (String month){
        if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")){
            return "Is winter";
        }else if (month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equals("May")){
            return "Is Spring";
        }else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
            return "Is Summer";
    }else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
            return "Is Autum";
        }else {
            return "Incorrect Data";
        }

}

}