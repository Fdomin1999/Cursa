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



                for (int i = 0; i < participanteArrayList.size(); i++) {

                    participanteArrayList.get(i).setTiempo(moto.correr());

                    System.out.format("%s %.2f \n",participanteArrayList.get(i).getNombre(), participanteArrayList.get(i).getTiempo());
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

//      Dar puntos a los participantes

        if (participanteArrayList.size() >= 5){
            participanteArrayList.get(0).setPuntos(participanteArrayList.get(0).getPuntos()+5);
            participanteArrayList.get(1).setPuntos(participanteArrayList.get(1).getPuntos()+4);
            participanteArrayList.get(2).setPuntos(participanteArrayList.get(2).getPuntos()+3);
            participanteArrayList.get(3).setPuntos(participanteArrayList.get(3).getPuntos()+2);
            participanteArrayList.get(4).setPuntos(participanteArrayList.get(4).getPuntos()+1);

        }
        else if (participanteArrayList.size() == 4){
            participanteArrayList.get(0).setPuntos(participanteArrayList.get(0).getPuntos()+5);
            participanteArrayList.get(1).setPuntos(participanteArrayList.get(1).getPuntos()+4);
            participanteArrayList.get(2).setPuntos(participanteArrayList.get(2).getPuntos()+3);
            participanteArrayList.get(3).setPuntos(participanteArrayList.get(3).getPuntos()+2);
        }
        else if (participanteArrayList.size() == 3){
            participanteArrayList.get(0).setPuntos(participanteArrayList.get(0).getPuntos()+5);
            participanteArrayList.get(1).setPuntos(participanteArrayList.get(1).getPuntos()+4);
            participanteArrayList.get(2).setPuntos(participanteArrayList.get(2).getPuntos()+3);
        }
        else if (participanteArrayList.size() == 2){
            participanteArrayList.get(0).setPuntos(participanteArrayList.get(0).getPuntos()+5);
            participanteArrayList.get(1).setPuntos(participanteArrayList.get(1).getPuntos()+4);
        }

        System.out.println();
        System.out.println();

        participanteArrayList.stream().forEach((p)->{ System.out.println(p); });


    }


    void mostrarClasificacion(){

        System.out.println("\n");
        System.out.println("\n");

        for (int i = 0; i < participanteArrayList.size(); i++) {
            participanteArrayList.get(i).setTiempo(0f);
        }

        Collections.sort(participanteArrayList, new Comparator<Participante>() {
            @Override
            public int compare(Participante pA, Participante pZ) {

                if (pA.puntos > pZ.puntos) return -1;
                else if (pA.puntos < pZ.puntos) return 1;
                else return 0;
            }
        });


        for (Participante participante : participanteArrayList) {
            System.out.println(participante);
        }
    }
}

