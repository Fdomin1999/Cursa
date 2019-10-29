package com.company;

import java.util.Scanner;

public class Configuracion {
Scanner sc = new Scanner(System.in);
String tipoVehiculo;
Carrera carrera = new Carrera();
    String  escogerNombre(){
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        return nombre;
    }

    int escogerCantidadParticipantes(){
        System.out.println("Cantidad de participantes: ");
        int cantidadParticipantes = sc.nextInt();
        return cantidadParticipantes;

    }
    int escogerCantidadCircuitos(){
        System.out.println("Cantidad de circuitos: ");
        int cantidadCircuitos = sc.nextInt();
        sc.nextLine();
        return cantidadCircuitos;

    }


    String escogerVehiculo(){
        System.out.println("Que vehiculo quieres Bicicleta, coche, moto o camion ??");
        this.tipoVehiculo = sc.nextLine();
        return tipoVehiculo;
    }

}