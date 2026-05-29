package lab07;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LAB-USR-AREQUIPA
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaEnlazada lista = new ListaEnlazada();

        int opcion;
        int dato;

        do {

            System.out.println("\n===== MENU LISTA ENLAZADA =====");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar al inicio");
            System.out.println("4. Eliminar al final");
            System.out.println("5. Buscar elemento");
            System.out.println("6. Mostrar lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();

                    lista.insertarInicio(dato);
                    break;

                case 2:

                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();

                    lista.insertarFinal(dato);
                    break;

                case 3:

                    lista.eliminarInicio();
                    break;

                case 4:

                    lista.eliminarFinal();
                    break;

                case 5:

                    System.out.print("Ingrese elemento a buscar: ");
                    dato = sc.nextInt();

                    lista.buscar(dato);
                    break;

                case 6:

                    lista.mostrar();
                    break;

                case 7:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);
    }
}