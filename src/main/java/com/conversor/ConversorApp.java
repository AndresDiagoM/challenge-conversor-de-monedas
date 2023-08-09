package com.conversor;
import java.util.Scanner;
import com.conversor.model.*;

/**
 *
 * @author Andres Diago
 */
public class ConversorApp {

    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        // System.out.println("Digite um valor em metros: ");
        // double metros = entrada.nextDouble();
        // double centimetros = metros * 100;
        // System.out.println("O valor em centimetros é: " + centimetros);

        ConversorLongitudes conversor = new ConversorLongitudes();
        conversor.mostrarMenu();
    }
}
