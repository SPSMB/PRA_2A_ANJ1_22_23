package com.company;

import java.util.Scanner;

public class VyberTelefonu {

    /*
    Vytvořte program pro výběr telefonu. Uživatel zadá v textu výrobce a program podle vstupu vypíše konkrétní model a jeho cenu. Použijte switch.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner - vstup z konzole
        System.out.println("Zadej značku telefonu");
        String s = sc.nextLine(); //Uživatel zadá značku - uložíme do proměnné s datovým typem String
        switch (s) { //Switch - jako vstup uvedeme proměnnou S (značka telefonu)
            case "samsung": //Případ "samsung" - provede se v případě, že hodnota proměnné S bude "samsung"
                System.out.println("Vybral jsi si Samsung Galaxy A53 (cena 10 000 Kč)");
                break;
            case "iphone": //Případ "iphone" - provede se v případě, že hodnota proměnné S bude "iphone"
                System.out.println("Vybral jsi si iPhone 13 (cena 23 000 Kč)");
                break;
            default: //Výchozí případ - provede se v moment, kdy hodnota proměnné S není ani samsung, ani iphone.
                System.out.println("Tento typ telefonu neznám");
                break;
        }
    }
}
