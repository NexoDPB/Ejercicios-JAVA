package org.example.estructuraDatos;

public class Nodo<T> {
    private T dato;
    private Nodo<T> sig;

    public Nodo () {
        this.dato = null;
        this.sig = null;
    }
    public Nodo (T dato) {
        this.dato = dato;
        this.sig = null;
    }

    public Nodo<T> getSig() {
        return sig;
    }
    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }
    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }
}
