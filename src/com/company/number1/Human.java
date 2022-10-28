package com.company.number1;

public class Human {
    public String firstname;
    public String lastname;
    public int year;
    public static int now = 2022;

    public void print(int age){
        System.out.println(lastname +" "+ firstname +" "+ age);
    }
    public int age(){
        return now-year;
    }
}
