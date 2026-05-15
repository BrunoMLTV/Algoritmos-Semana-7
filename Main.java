package lab07;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LAB-USR-AREQUIPA
 */

public class Main {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        // =========================
        // PRUEBA LISTA VACÍA
        // =========================
        System.out.println("Lista inicial:");
        lista.mostrar();

        // =========================
        // INSERCIONES
        // =========================
        System.out.println("\nInsertando elementos...");

        lista.insertarInicio(10);
        lista.insertarInicio(5);

        lista.insertarFinal(20);
        lista.insertarFinal(30);

        System.out.println("Lista después de insertar:");
        lista.mostrar();

        // =========================
        // ELIMINAR CABEZA
        // =========================
        System.out.println("\nEliminando 5:");

        lista.eliminar(5);

        lista.mostrar();

        // =========================
        // ELIMINAR INTERMEDIO
        // =========================
        System.out.println("\nEliminando 20:");

        lista.eliminar(20);

        lista.mostrar();

        // =========================
        // ELIMINAR NO EXISTENTE
        // =========================
        System.out.println("\nEliminando 100:");

        lista.eliminar(100);

        lista.mostrar();

        // =========================
        // ELIMINAR ÚLTIMO
        // =========================
        System.out.println("\nEliminando 30:");

        lista.eliminar(30);

        lista.mostrar();
    }
}