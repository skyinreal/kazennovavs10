package com.company.number3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PotentialEnergy potentialEnergy = new PotentialEnergy();
        potentialEnergy.setH(scanner.nextInt());
        potentialEnergy.setM(scanner.nextInt());
        System.out.println(potentialEnergy.potEn());
    }
}
