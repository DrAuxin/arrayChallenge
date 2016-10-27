package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int grades[] = new int[1000];
        String grade[] = new String[1000];
        Scanner user = new Scanner(System.in);
        System.out.println();
        int h = 0;
        System.out.println("Enter grade and name or exit to exit.");
        while (true) {
            System.out.println("Enter name");
            String y = user.nextLine();
            if (y.equalsIgnoreCase("Exit"))
                break;
            grade[h] = y;
            System.out.println("Enter grade");
            String z = user.nextLine();
            if (z.equalsIgnoreCase("Exit"))
                break;
            grades[h] = Integer.parseInt(z);
            h++;
        }
        int b = 0;
        for (int j = 0; j < h; j++) {
            b += grades[j];
        }
        System.out.println("Average: " + b / h);
        for (int j = 0; j < h; j++) {
            System.out.println(grade[j]);
        }
    }
}
