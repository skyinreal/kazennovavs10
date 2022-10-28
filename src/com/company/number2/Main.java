package com.company.number2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RightTriangle rightTriangle = new RightTriangle(scanner.nextInt(), scanner.nextInt());
        System.out.println(rightTriangle.hypoten());
    }
}
