package com.company;


import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    void lanzarMenu(){




        System.out.println("TORNEO: ");
        System.out.println("1.Equipos");
        System.out.println("2.Participantes");
        System.out.println("3.Resultados");
        System.out.println("4.Clasificacion");
        System.out.println("5. Salir");
        System.out.println("Elige una opcion:");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                return;

        }
    }
}
