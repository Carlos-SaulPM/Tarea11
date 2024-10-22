package unam.fesaragon.estructuradatos.recursividad;

import unam.fesaragon.estructuradatos.adts.ADTStack;

public class Recursividad {
    public static void main(String[] args) {
        ADTStack<String> enteros = new ADTStack<>();
        enteros.push("C");
        enteros.push("A");
        enteros.push("R");
        enteros.push("L");
        enteros.push("O");
        enteros.push("S");
        enteros.push("S");
        System.out.println(posicionMediaPila(enteros, enteros.length()));
        enteros.imprimirStack();
        int resultado = potencia(5,5);
        System.out.println(resultado);
    }

    public static Object posicionMediaPila(ADTStack pila, int tamanioOriginal) {
        if (tamanioOriginal % 2 == 0) {
            System.out.println("Es pila par");
            return null;
        }
        if (pila.length() == tamanioOriginal / 2 + 1) {
            return pila.peek();
        }
        Object elementoQuitado = pila.pop();
        Object medio = posicionMediaPila(pila, tamanioOriginal);
        pila.push(elementoQuitado);
        return medio;
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

}
