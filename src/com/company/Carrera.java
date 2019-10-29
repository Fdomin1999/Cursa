package com.company;

import java.util.Random;

public class Carrera {
    String tipoVehiculo;
    int cantidadParticipantes;
    int cantidadCircuitos;
    Random random = new Random();
    String nombre;

    void recogerDatos(String tipoVehiculoRetornado, int cantidadParticipantesRetornado, int cantidadCircuitosRetorrando, String nombreRetornado ){
    this.tipoVehiculo = tipoVehiculoRetornado;
    this.cantidadParticipantes = cantidadParticipantesRetornado;
    this.cantidadCircuitos = cantidadCircuitosRetorrando;
    this.nombre = nombreRetornado;

        System.out.println(tipoVehiculoRetornado);


    }



    void resultado(){
        if (tipoVehiculo.equals("coche")){
            System.out.println(nombre + " " + "1" + ":" + (random.nextInt(15) + 30) + " Minutos");
            for (int i = 0; i < cantidadParticipantes-1; i++) {

                System.out.println("Paricipante " + (i+1) + " " + "1" + ":" + (random.nextInt(15) + 30) + " Minutos");


            }

        } else if (tipoVehiculo.equals("bicicleta")){
            System.out.println((random.nextInt(5)+5) + ":" +  (random.nextInt(15)+30) + " Minutos");



        } else if (tipoVehiculo.equals("moto")){

            System.out.println("1" + ":" +  (random.nextInt(29)+30) + " Minutos");


        } else if (tipoVehiculo.equals("camion")){

            System.out.println((random.nextInt(8)+5) + ":" +  (random.nextInt(15)+30) + " Minutos");


        }
    }

}
