package org.example;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
    public class App {



           public static void main(String[] args){

            System.out.println(" You are Welcome to my Calculator App");
            System.out.println();
            System.out.println(" PleASE FOLLOW THE INSTRUCTION");
            System.out.println("------------------------------------");
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter Number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter Number 2: ");
            int num2 = sc.nextInt();

            System.out.println("Num1 : " + num1  + " " + "Num2 : " + num2);
            int result1 = addition(num1,num2);       // num1 - num2
            int result2 = subtraction(num1,num2);
            int result3 = multiplication(num1, num2);
            int result4 = division(num1, num2);
            System.out.println();
            System.out.println(" The Add result is" + " " +result1);
            System.out.println(" The Subtract result is" + " " +result2);
            System.out.println(" The Multiply result is" + " " +result3);
            System.out.println(" The division result is" + " " +result4);
           }

    public static int addition(int num1, int num2) {
                  return num1 + num2;

    }


    public static int subtraction(int num1, int num2){

             return num2 - num1;

            }


     public static int multiplication (int num1, int num2){
                return num1 * num2;
           }

           public static int division (int num1, int num2){
                 return num2 / num1;
           }

    }