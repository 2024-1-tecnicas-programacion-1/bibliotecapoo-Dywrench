package com.mycompany.bibliotecapoo;

import java.time.Year;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private boolean leido;
    private boolean LeidoAntes;
    private int anoPublicacion;

    // complejidad temporal O(1)
    public Libro(String titulo, String autor, String genero, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.LeidoAntes = false;
    }

    // complejidad temporal O(1)
    public String mostrarInformacion() {
        return ("Título: " + titulo + ", " + "Autor: " + autor + ", " + "Año de publicación: " + anoPublicacion + ", " + " Género: " + genero);
    }

    // complejidad temporal O(1)
    public void marcarleido(boolean leido) {
        this.leido = leido;
    }

    // complejidad temporal O(1)
    boolean getLeido() {
        return leido;

    }

    // complejidad temporal O(1)
    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    // complejidad temporal O(1)
    public String mostrarInfoLeido() {
        if (getLeido()) {
            return ("Título: " + titulo + ", " + "Autor: " + autor + ", " + "Año de publicación: " + anoPublicacion + ", " + " Género: " + genero);
        } else {
            return "El libro no ha sido marcado como leído";
        }
    }

    // complejidad temporal O(1)
    String getTitulo() {
        return titulo;
    }
    // complejidad temporal O(1)

    String getautor() {
        return autor;
    }
    // complejidad temporal O(1)

    String getgenero() {
        return genero;
    }

    // complejidad temporal O(1)
    public boolean esantiguo() {
        int anoAtual = Year.now().getValue();
        int validarAntiguedad = anoAtual - anoPublicacion;
        return (validarAntiguedad > 50);

    }

}
