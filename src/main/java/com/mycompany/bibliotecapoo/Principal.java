package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // complejidad temporal O(1)
        Biblioteca laBiblioteca = new Biblioteca();

        int opcion;
        // complejidad temporal O(N)
        do {
            // complejidad temporal O(1)
            System.out.println("/////////////////////////////////");
            System.out.println("Bienvenido a la biblioteca Virtual");
            System.out.println("/////////////////////////////////");
            System.out.println("Seleccione una opción (número)");
            System.out.println("1) Registrar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("9) Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            
            // complejidad temporal O(1)
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título del libro");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese el año del libro");
                    int ano = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Ingrese el género literario del libro");
                    String genero = sc.nextLine();
                    System.out.println("¿El libro está leído? (true/false)");
                    boolean leido = sc.nextBoolean();
                    sc.nextLine(); 

                    Libro libro = new Libro(titulo, autor, genero, ano);
                    libro.marcarleido(leido);
                    laBiblioteca.registrarLibro(libro);
                    break;
                case 2:
                    System.out.println(laBiblioteca.mostrarLibros());
                    break;
                case 3:
                    System.out.println("Ingrese el título del libro que busca");
                    String tituloABuscar = sc.nextLine();
                    Libro libroEncontrado = laBiblioteca.buscarLibro(tituloABuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println(libroEncontrado.mostrarInformacion());
                    } else {
                        System.out.println("No se encontró el libro");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el título del libro que desea marcar como leído");
                    String tituloAMarcar = sc.nextLine();
                    laBiblioteca.marcarLibroLeido(tituloAMarcar);
                    break;
                case 5:
                    laBiblioteca.mostrarLibrosNoLeidos();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 9);
    }
}