package com.conversor;

import com.conversor.GUI.*;

/**
 *
 * @author felip
 */
public class AppRunner {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null); // Centrar la pantalla
    }
}
