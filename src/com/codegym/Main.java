package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("a*x +b=c");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a:");
        double a =scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c =scanner.nextDouble();

        if (a!=0){
            double answer = (a-b)/a;
            System.out.println(" Equation pass With X= "+answer);
        }else {
            if (b==c){
                System.out.println("the solution is all");
            }else {
                System.out.println("No solution");
            }
        }
    }
}