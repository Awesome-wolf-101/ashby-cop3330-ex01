package ex01.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */
import java.util.Scanner;

public class APP {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String OutPutString = "Hello, ";
        OutPutString += name;

        OutPutString  += ",nice to meet you";

        System.out.println(OutPutString);
    }
}
