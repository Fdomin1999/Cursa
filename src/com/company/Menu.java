package com.company;

import java.util.Scanner;

public class Menu {
    void lanzarMenu(){

        System.out.println("CURSA: ");
        System.out.println("1.Configuració de la competició");
        System.out.println("2.Resultats");
        System.out.println("3.Jugar");
        System.out.println("4.Acabar");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:


                break;
            case 2:

                break;
            case 3:

                break;

            case 4:
                return;


        }
    }
}
