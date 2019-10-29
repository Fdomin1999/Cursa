package com.company;

import java.util.Scanner;

public class Menu {
    Configuracion configuracion = new Configuracion();
    Carrera carrera = new Carrera();

    Scanner sc = new Scanner(System.in);
    String nombre;
    int cantidadParticipantes;
    int cantidadCircuitos;
    String tipoVehiculo;

    void lanzarMenu(){

        System.out.println("CURSA: ");
        System.out.println("1.Configuració de la competició");
        System.out.println("2.Resultats");
        System.out.println("3.Jugar");
        System.out.println("4.Acabar");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    nombre = configuracion.escogerNombre();
                    cantidadParticipantes = configuracion.escogerCantidadParticipantes();

                    cantidadCircuitos = configuracion.escogerCantidadCircuitos();
                    break;

                case 2:
                    mostrarClasificacion();
                    break;

                case 3:
                    tipoVehiculo = configuracion.escogerVehiculo();
                    carrera.recogerDatos(tipoVehiculo, cantidadParticipantes, cantidadCircuitos);

                    carrera.resultado();

                    break;

                case 4:
                    System.out.println("Pos sacabo");
                    return;


            }
            System.out.println("CURSA: ");
            System.out.println("1.Configuració de la competició");
            System.out.println("2.Resultats");
            System.out.println("3.Jugar");
            System.out.println("4.Acabar");

            opcion = sc.nextInt();
        }
    }

    void mostrarClasificacion(){

    }
}
