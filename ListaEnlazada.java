/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ListaEnlazada {
    Nodo cabeza;
    //Crear lista vacía
    public ListaEnlazada() {
        cabeza = null;
    }
    //Insertar al inicio
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }
    //Insertar al final
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
    //Eliminar un nodo
    public void eliminar(int dato) {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
        //Si el dato está en la cabeza
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null &&
               actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }
        //Si encontró el nodo
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        } else {
            System.out.println("Dato no encontrado");
        }
    }
    // Mostrar lista
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
