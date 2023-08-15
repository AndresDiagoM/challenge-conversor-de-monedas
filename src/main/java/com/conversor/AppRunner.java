package com.conversor;

import com.conversor.GUI.*;

/**
 * Clase principal del programa, se encarga de ejecutar la primera pantalla del programa.
 * @author Andres Diago
 * @version 1.0
 * 
 */
public class AppRunner {
    public static void main(String[] args) {
        Pantalla1 pantalla = new Pantalla1();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null); // Centrar la pantalla
    }
}
