package com.company.number1;

import com.company.number1.Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human human = new Human();
        human.lastname = scanner.next();
        human.firstname = scanner.next();
        human.year = scanner.nextInt();
        human.print(human.age());
    }
}