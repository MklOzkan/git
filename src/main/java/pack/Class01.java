package pack;

import java.util.Scanner;

public class Class01 {
    public static void main(String[] args) {
        System.out.println("hello");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = scan.nextLine();
        System.out.println("your name: " + s);
    }
}
