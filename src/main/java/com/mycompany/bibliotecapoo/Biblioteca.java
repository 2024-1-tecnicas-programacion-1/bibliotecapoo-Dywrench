package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

// complejidad temporal O(1)
public class Biblioteca {

    private LinkedList<Libro> biblioteca;

    // complejidad temporal O(1)   
    public Biblioteca() {
        biblioteca = new LinkedList<>();

    }

    // complejidad temporal O(1)
    public void registrarLibro(Libro libro) {
        biblioteca.add(libro);
    }

    // complejidad temporal O(N)
    public Libro buscarLibro(String palabraBusqueda) {
        for (Libro libro : biblioteca) {
            // complejidad temporal O(1)
            if (libro.getTitulo().equalsIgnoreCase(palabraBusqueda)
                    || libro.getautor().equalsIgnoreCase(palabraBusqueda)
                    || libro.getgenero().equalsIgnoreCase(palabraBusqueda)) {
                return libro;
            }
        }
        return null;
    }

    // complejidad temporal O(N)
    public String mostrarLibros() {
        StringBuilder infoLibros = new StringBuilder();
        for (Libro libro : biblioteca) {
            infoLibros.append(libro.mostrarInformacion()).append("\n");
        }
        return infoLibros.toString();
    }

    // complejidad temporal O(N)
    public boolean hayLibrosNoLeidos() {
        for (Libro libro : biblioteca) {
            if (!libro.getLeido()) {
                return true;
            }
        }
        return false;
    }

    public void mostrarLibrosNoLeidos() {
        boolean hayLibrosNoLeidos = false; 
        System.out.println("Libros no leídos:");
        for (Libro libro : biblioteca) {
            if (!libro.getLeido()) {
                System.out.println(libro.mostrarInformacion());
                hayLibrosNoLeidos = true;
            }
        }
        if (!hayLibrosNoLeidos) {
            System.out.println("No hay libros no leídos en la biblioteca.");
        }
    }

    public void marcarLibroLeido(String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null) {
            libro.marcarleido(true);
            System.out.println("Libro marcado como leído");
        } else {
            System.out.println("No se encontró el libro");
        }
    }
}