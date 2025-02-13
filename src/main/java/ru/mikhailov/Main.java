package ru.mikhailov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);
            boolean bool = Character.isDigit(ch);
            if (!bool) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}