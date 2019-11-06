package com.company;

import java.util.Random;

public class Moto extends Vehiculo{
    int cilindrada = 999;
    int peso = 200;

    Random random = new Random();


    float correr() {

        int tiempo = random.nextInt(29) + 30;
        float tiempotofloat = (float) tiempo;
        float tiempobueno = 1 + (tiempotofloat/100);

    return tiempobueno;
    }
}
