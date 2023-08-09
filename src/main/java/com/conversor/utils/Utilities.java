/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.utils;

/**
 *
 * @author felip
 */
public class Utilities {
    
    
    // ----------------- METODOS --------------------
    public static boolean esNumero(String txt) {
        try {
            Float.valueOf(txt);  // Intentar convertir el texto a un número decimal
            return true;  // Si tiene éxito, retornar true
        } catch (NumberFormatException e) {  // Si falla, capturar la excepción
            return false;  // Y retornar false
        }
    }
}
