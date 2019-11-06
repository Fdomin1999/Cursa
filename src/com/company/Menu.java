package com.company;

import java.util.Scanner;

public class Menu {
    Configuracion configuracion = new Configuracion();
    Carrera carrera = new Carrera();
    Moto moto = new Moto();

    Scanner sc = new Scanner(System.in);
    String nombre;
    int cantidadParticipantes;
    int cantidadCircuitos;
    String tipoVehiculo;

    void lanzarMenu(){



        int opcion = 0;

            do {
                System.out.println();
                System.out.println("CURSA: ");
                System.out.println("1.Configuració de la competició");
                System.out.println("2.Resultats");
                System.out.println("3.Jugar");
                System.out.println("4.Acabar");

                opcion = sc.nextInt();
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
                        carrera.recogerDatos(tipoVehiculo, cantidadParticipantes, cantidadCircuitos, nombre);

                        carrera.resultado();

                        break;

                    case 4:
                        System.out.println("Pos sacabo");
                        return;


                }


            }while (opcion!=4);
    }

    void mostrarClasificacion(){

    }
}
