package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case"hello": System.out.println("Hello world!"); break;
            case "info":
                System.out.println("Szia"); break;
            case"exit":System.exit(1); break;



        }
    }

}