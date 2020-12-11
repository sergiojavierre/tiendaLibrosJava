package com.piramide;

import com.piramide.controladores.ControladorTienda;
import com.piramide.modelos.Autor;

public class Main {

    public static void main(String[] args) {

        ControladorTienda controladorTienda = new ControladorTienda();

       // controladorTienda.añade(new Autor("JK Rowling"));

        System.out.println(controladorTienda.getAutores());

    }
}
