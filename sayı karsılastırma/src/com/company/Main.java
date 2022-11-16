package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("girilen sayi: " + sayi);

    if(sayi < 50)
    {
        System.out.println("sayi 50 den kucuktur");
    }
    else if(sayi == 50)
    {
        System.out.println("sayi 50 ye esittir");
    }
    else if(sayi > 50)
    {
        System.out.println("sayi 50 den buyuktur");
    }

    }
}
