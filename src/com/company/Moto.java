package com.company;

import java.util.Random;

public class Moto extends Vehiculo{
    private int cilindrada = 999;
    private int peso = 200;

    Random random = new Random();


    public float correr() {

        int tiempo = random.nextInt(29) + 30;
        float tiempotofloat = (float) tiempo;
        float tiempobueno = 1 + (tiempotofloat/100);



    return tiempobueno;
    }
}
