
package ScannerExamples;

import java.util.Scanner;
public class Example1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls 3 number (day, month, year)");

        System.out.println("Day: ");
        int day = sc.nextInt();


        System.out.println("Month: ");
        int month = sc.nextInt();


        System.out.println("Year: ");
        int year = sc.nextInt();


        sc.close();


        System.out.println("Your date is " + day + '.' + month + '.' + year);





    }

}
