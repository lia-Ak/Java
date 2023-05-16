package ScannerExamples;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args){
        System.out.println("Enter pls a radius:");


        Scanner sc = new Scanner(System.in);




       float radius = sc.nextFloat();
        sc.close();

        double result = Math.PI * Math.pow(radius,2);
        System.out.println("Square is " + result);



    }
}
