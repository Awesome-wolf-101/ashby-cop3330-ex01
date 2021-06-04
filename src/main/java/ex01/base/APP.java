package ex01.base;

import java.util.Scanner;

public class APP {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Hello, " + name);
        System.out.print(" nice to meet you");
    }
}
