package traker;

import java.util.Scanner;

public class MahOperation {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first,second,resalt;
        System.out.println("Enter fitst num :");
        first = num.nextInt();
        System.out.println("Enter second num: ");
        second = num.nextInt();
        resalt = first + second;
        resalt ++;
        System.out.println("Resalt is: " + resalt);
    }
}
