package com.conversor.utils;

/**
 * Clase con métodos de utilidad para el programa
 * @author felip
 */
public class Utilities {
    
    
    // ----------------- METODOS --------------------
    /**
     * Método que verifica si un texto es un número
     * @param txt
     * @return
     */
    public static boolean esNumero(String txt) {
        try {
            Float.valueOf(txt);  // Intentar convertir el texto a un número decimal
            return true;  // Si tiene éxito, retornar true
        } catch (NumberFormatException e) {  // Si falla, capturar la excepción
            return false;  // Y retornar false
        }
    }
}
