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

    private Nodo cabeza;

    // Crear lista vacía
    public ListaEnlazada() {
        cabeza = null;
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Insertar al inicio
    public void insertarInicio(int dato) {

        Nodo nuevo = new Nodo(dato);

        nuevo.siguiente = cabeza;
        cabeza = nuevo;

        System.out.println("Elemento insertado al inicio.");
    }

    // Insertar al final
    public void insertarFinal(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            cabeza = nuevo;
        } else {

            Nodo aux = cabeza;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }

            aux.siguiente = nuevo;
        }

        System.out.println("Elemento insertado al final.");
    }

    // Eliminar al inicio
    public void eliminarInicio() {

        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        System.out.println("Elemento eliminado: " + cabeza.dato);

        cabeza = cabeza.siguiente;
    }

    // Eliminar al final
    public void eliminarFinal() {

        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        // Si solo hay un nodo
        if (cabeza.siguiente == null) {

            System.out.println("Elemento eliminado: " + cabeza.dato);

            cabeza = null;
            return;
        }

        Nodo aux = cabeza;

        while (aux.siguiente.siguiente != null) {
            aux = aux.siguiente;
        }

        System.out.println("Elemento eliminado: " + aux.siguiente.dato);

        aux.siguiente = null;
    }

    // Buscar elemento
    public void buscar(int dato) {

        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo aux = cabeza;
        int posicion = 1;

        while (aux != null) {

            if (aux.dato == dato) {
                System.out.println("Elemento encontrado en posición: " + posicion);
                return;
            }

            aux = aux.siguiente;
            posicion++;
        }

        System.out.println("Elemento no encontrado.");
    }

    // Mostrar lista
    public void mostrar() {

        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo aux = cabeza;

        System.out.print("Lista: ");

        while (aux != null) {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        }

        System.out.println("null");
    }
}