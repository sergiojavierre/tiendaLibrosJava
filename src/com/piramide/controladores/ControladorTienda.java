package com.piramide.controladores;

import com.piramide.modelos.Autor;
import com.piramide.modelos.Libro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorTienda {

    List<Autor> autores;
    List<Libro> libros;

    private final String fileAutores = "autores";

    public ControladorTienda(){
        this.autores = getAutoresFromPersistance();
        if(this.autores == null){
            this.autores = new ArrayList<>();
        }
        this.libros = new ArrayList<>();
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    private List<Autor> getAutoresFromPersistance(){
        List<Autor> autores = null;
        try {
            FileInputStream fis = new FileInputStream(fileAutores);
            ObjectInputStream ois = new ObjectInputStream(fis);
            autores = (List<Autor>)ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return autores;
    }

    public void añade(Autor autor){
        autores.add(autor);
        try {
            FileOutputStream fos = new FileOutputStream(fileAutores);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(autores);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void añade(Libro libro){

    }

    public Autor buscaAutor(String autor){
        Autor objAutor = null;
        return objAutor;
    }

    public Libro buscaLibro(String titulo){
        Libro objLibro = null;
        return objLibro;
    }

}
