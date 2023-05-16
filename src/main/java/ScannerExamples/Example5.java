package ScannerExamples;

import java.util.Scanner;

public class Example5 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("age: ");
        int age = sc.nextInt();


        sc.nextLine();


        System.out.println("country: ");
        String country = sc.nextLine();

        System.out.println("Name: ");
        String name = sc.nextLine();

        sc.close();

        System.out.println("Person name is " + name + ", country is " + country + ", age = " + age);



    }
}
