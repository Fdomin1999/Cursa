package com.company;

public class Participante {

    String nombre;
    int puntos;
    Float tiempo;

    public Participante(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.tiempo = 0f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }



    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(Float tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                ", tiempo=" + tiempo +
                '}';
    }

    //
//    tiempo1particiapnte
//    tiempo2partci
//    tiempototal = sumar tiemp+tiempo+to/cantidadCircuitos;


}
