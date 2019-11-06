package com.company;

import java.util.Random;

public class Coche extends Vehiculo{
    int cilindrada = 3000;
    int peso = 1000;
    Random random = new Random();



    String correr() {
        String tiempo = " 1" + ":" + (random.nextInt(15) + 30) + " Minutos";

        return tiempo;

    }
}
