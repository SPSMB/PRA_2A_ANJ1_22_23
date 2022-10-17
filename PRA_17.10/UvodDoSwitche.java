package com.company;

public class UvodDoSwitche {

    public static void main(String[] args) {
        int x = 18; //Výchozí proměnná na ukázku práce se switchem
        switch (x) { //Switch - porovnává vstup s případy. Vstup zapisujeme do kulatých závorek
            case 1: //Případ, který nastane v moment, kdy X je rovno 1
                System.out.println("X je rovno 1");
                break; //Každý případ je potřeba zakončit slovíčkem break
            case 2: //Případ, který nastane v moment, kdy X je rovno 2
                System.out.println("X je rovno 2");
                break;
            case 3: //Případ, který nastane v moment, kdy X je rovno 3
                System.out.println("X je rovno 3");
                break;
            default: //Výchozí případ - nastane když ani jeden z případů není splněn
                System.out.println("X neni ani 1, ani 2, ani 3");
                break;
        }
    }
}
