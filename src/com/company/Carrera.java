package com.company;

import java.util.Random;

public class Carrera {
    String tipoVehiculo;
    int cantidadParticipantes;
    int cantidadCircuitos;
    Random random = new Random();

    void recogerDatos(String tipoVehiculoRetornado, int cantidadParticipantesRetornado, int cantidadCircuitosRetorrando ){
    tipoVehiculo = tipoVehiculoRetornado;
        System.out.println(tipoVehiculoRetornado);


    }



    void resultado(){
        if (tipoVehiculo.equals("coche")){
            for (int i = 0; i < cantidadParticipantes; i++) {

                System.out.println("Paricipante " + i + " " + "1" + ":" + (random.nextInt(15) + 30) + " Minutos");


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
