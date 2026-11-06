package org.example.estructuraDatos;

public class ListaSimple<T> {
    private Nodo<T> cabeza;
    public ListaSimple() {
        cabeza = null;
    }

    public void insertar (T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo<T> actual = cabeza;
        while (actual.getSig() != null) actual = actual.getSig();
        actual.setSig(nuevo);
    }

    public String mostrar () {
        String resultado = "";
        Nodo<T> actual = cabeza;
        while (actual != null) {
            resultado += actual.getDato() + "\t";
            actual = actual.getSig();
        }
        return resultado;
    }
}
