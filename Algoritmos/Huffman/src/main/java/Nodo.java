package main.java;

public class Nodo {
    public static final int Datoclave = 0;
    Character ch;
    Integer freq;
    Nodo izda = null, dcha = null;
    public Nodo hijoIzqdo;
    public Nodo hijoDrcho;

    Nodo(Character ch, Integer freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public Nodo(Character ch, Integer freq, Nodo izda, Nodo dcha) {
        this.ch = ch;
        this.freq = freq;
        this.izda = izda;
        this.dcha = dcha;
    }

}
