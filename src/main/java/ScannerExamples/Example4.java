package ScannerExamples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args){

        System.out.println("Enter pls your fullName: ");

        Scanner sc =  new Scanner(System.in);
        String fullName = sc. nextLine();
        sc.close();


        System.out.println("hello " + fullName);
    }
}
