/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;

/**
 *
 * @author NC
 */
public class Functions {

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        while(a==1)
        inputData();
//        Scanner sc = new Scanner(System.in);
//        int a, b;
//        System.out.println("Enter first number : ");
//        a = sc.nextInt();
//        System.out.println("Enter second number : ");
//        b = sc.nextInt();
//        System.out.println("SUm of two numbers : "+add(a,b));
    }

    static void inputData() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first number : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b = sc.nextInt();
        choices(a,b);
        
    }

    static void choices(int a,int b) {
        System.out.println("============================================");
        System.out.println("===============Your Choices=================");
        System.out.println("============================================");
        System.out.println("Press 1 for Addition.");
        System.out.println("Press 2 for Subtraction.");
        System.out.println("Press 3 for Multiplication.");
        System.out.println("Press 4 for Division.");
        System.out.println("Press any other key to exit.");
        System.out.println("============================================");
        choiceInput(a, b);
    }

    static void choiceInput(int a, int b) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Enter your choice : ");
        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                product(a, b);
                break;
            case 4:
                divide(a, b);
                break;
            default:
                System.exit(0);

        }
    }

    static void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum of two numbers : " + c);
    }

//    static int add(int a, int b){
//        return a+b;
//    }
    static void sub(int a, int b) {
        int c = a - b;
        System.out.println("Diiference of two numbers : " + c);
    }

    static void product(int a, int b) {
        int c = a * b;
        System.out.println("Product of two numbers : " + c);
    }

    static void divide(int a, int b) {
        int c = a / b;
        System.out.println("Division of two numbers : " + c);
    }
}
