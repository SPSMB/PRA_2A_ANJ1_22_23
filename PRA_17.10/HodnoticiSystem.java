package com.company;

import java.util.Scanner;

public class HodnoticiSystem {
    
    /*
    Vytvořte program, kde uživatel zadá číslo od 0 do 100 (úspěšnost) a program následně vypíše známku podle dosažené úspěšnosti.
    Hodnocení:
    100 - 80: 1
    79 - 60: 2
    59 - 40: 3
    39 - 20: 4
    19 - 0: 5
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner, získáváme vstup z konzole
        System.out.println("Zadej úspěšnost od 0 do 100"); //Ptáme se uživatele na hodnotu
        int x = sc.nextInt(); //Hodnotu od uživatele uložíme do proměnné
        if (x <= 19) { //Podmínka - jestliže je X menší nebo rovno 19 => známka je rovna 5
            System.out.println("Známka: 5");
        } else if (x <= 39) { //Podmínka - jestliže je X menší nebo rovno 39 => známka je rovna 4
            System.out.println("Známka: 4");
        } else if (x <= 59) { //Podmínka - jestliže je X menší nebo rovno 59 => známka je rovna 3
            System.out.println("Známka: 3");
        } else if (x <= 79) { //Podmínka - jestliže je X menší nebo rovno 79 => známka je rovna 2
            System.out.println("Známka: 2");
        } else { //Podmínka - jestli X NENÍ menší než 19, 39, 59 a 79 => známka je rovna 1
            System.out.println("Známka: 1");
        }
    }
}
