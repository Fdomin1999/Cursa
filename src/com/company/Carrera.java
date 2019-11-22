package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Carrera {
    String tipoVehiculo;
    int cantidadParticipantes;
    int cantidadCircuitos;
    Moto moto = new Moto();
    Coche coche = new Coche();
    Random random = new Random();
    String nombre;
    float tiemponombre;
    ArrayList<Participante> participanteArrayList = new ArrayList<>();
    ArrayList<Participante> participantesOrdenados = new ArrayList<>();

    void recogerDatos(String tipoVehiculoRetornado, int cantidadParticipantesRetornado, int cantidadCircuitosRetorrando, String nombreRetornado ){
        this.tipoVehiculo = tipoVehiculoRetornado;
        this.cantidadParticipantes = cantidadParticipantesRetornado;
        this.cantidadCircuitos = cantidadCircuitosRetorrando;
        this.nombre = nombreRetornado;

        participanteArrayList.add(new Participante(nombre, 0));

        for (int i = 0; i < cantidadParticipantes; i++) {
            participanteArrayList.add(new Participante("Participante " + (i+1), 0));
        }

        System.out.println(tipoVehiculoRetornado);
    }


    void resultado() {
        for (int j = 0; j < cantidadCircuitos; j++) {




            // resetar el tiempo de cada participante

            for (int i = 0; i < participanteArrayList.size(); i++) {
            participanteArrayList.get(i).setTiempo(0f);
            }


            System.out.println("\n" + "Circuito " + (j + 1) + "\n");


            if (tipoVehiculo.equals("moto")) {


                participanteArrayList.get(0).setTiempo(moto.correr());
                System.out.format("%s %.2f \n", nombre, participanteArrayList.get(0).getTiempo());


                for (int i = 0; i < participanteArrayList.size()-1; i++) {

                    participanteArrayList.get(i+1).setTiempo(moto.correr());

                    System.out.format("Participante %d %.2f \n",i+1, participanteArrayList.get(i+1).getTiempo());
                    System.out.println(participanteArrayList.get(i).getNombre());
                }

                acumularPuntosCarrera();
            }
            else if (tipoVehiculo.equals("coche")) {
                System.out.println(nombre + " " + coche.correr());
                for (int i = 0; i < cantidadParticipantes - 1; i++) {

                    System.out.println("Participante " + (i + 1) + " " + moto.correr());
                }
            }
        }
    }

    private void acumularPuntosCarrera() {
        Collections.sort(participanteArrayList, new Comparator<Participante>() {
            @Override
            public int compare(Participante pA, Participante pZ) {

                return pA.tiempo.compareTo(pZ.tiempo);
            }
        });


        // acumular puntos a los 5 primeros
        // OJO: tener en cuenta si el numero de participante es menor a 5
        participanteArrayList.stream().forEach((p)->{ System.out.println(p); });

//      Dar puntos a los participantes
        for (int i = 0; i < participanteArrayList.size(); i++) {
            if (participanteArrayList.get(i).getNombre().equals(nombre)){
                participanteArrayList.get(i).set

            }
        }

        for (Participante participante : participanteArrayList) {
            if (participante.getNombre().equals(nombre)){

            }
        }



    }

    void mostrarClasificacion(){

    }
}

