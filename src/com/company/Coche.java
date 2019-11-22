package com.company;

import java.util.Random;

public class Coche extends Vehiculo{
    private int cilindrada = 3000;
    private int peso = 1000;
    Random random = new Random();



    public float correr() {
        int tiempo = random.nextInt(29) + 30;
        float tiempotofloat = (float) tiempo;
        float tiempobueno = 1 + (tiempotofloat/100);
        return tiempobueno;
    }
}
