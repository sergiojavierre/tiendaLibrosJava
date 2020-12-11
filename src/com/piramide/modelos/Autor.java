package com.piramide.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Autor implements Serializable {

    private String nombre;
    private List<Libro> libros;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }
}
