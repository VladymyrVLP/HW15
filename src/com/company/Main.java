package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int x;
     Scanner scan = new Scanner(System.in);
      do {
        System.out.println("Please enter your number");
        while (!scan.hasNextInt()) {
            System.out.println("That not a number");
            scan.next();
         }
        x = scan.nextInt();
      }while ( x <= 0);

      Digit[] digits = Digit.createDigits(new String[]{
                "  ###      #     #####   #####  #       #######  #####  #######  #####   ##### ",
                " #   #    ##    #     # #     # #    #  #       #     # #    #  #     # #     #",
                "#     #  # #          #       # #    #  #       #           #   #     # #     #",
                "#     #    #     #####   #####  #    #  ######  ######     #     #####   ######",
                "#     #    #    #             # #######       # #     #   #     #     #       #",
                " #   #     #    #       #     #      #  #     # #     #   #     #     # #     #",
                "  ###    #####  #######  #####       #   #####   #####    #      #####   ##### "
        });

        int height = digits[0].lines.length;

        int length = String.valueOf(x).length();
        int[] num = new int[length];
       while(x != 0){
           num[--length] = x % 10;
           x /= 10;
       }
        int[] number = num;
        for (int i = 0; i < height; i++) {
            for (int digit : number) {
                System.out.print(digits[digit].lines[i] + " ");
            }
            System.out.println();
        }
    }
}
