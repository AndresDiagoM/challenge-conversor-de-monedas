package com.conversor.model;

import java.util.Scanner;
/**
 * Clase que representa un conversor de longitudes
 * @author felip
 * @version 1.0
 */
public class ConversorLongitudes {
    
    //---------- Atributos ----------
    private Double metros;
    private Double centimetros;
    private static Scanner entrada = new Scanner(System.in);
    // static para que sea compartido por todas las instancias de la clase
    private static Integer opcion;

    //---------- Construtores ----------
    public ConversorLongitudes(Double metros) {
        this.metros = metros;
        this.centimetros = metros * 100;
    }
    public ConversorLongitudes() {
        this(Double.valueOf(0));
    }

    //---------- Métodos ----------
    public void mostrarMenu() {
        System.out.println("=====================================================");
        System.out.println("BIENVENIDO AL CONVERSOR DE ORACLE - ONE");
        System.out.println("1 - Converter metros para centímetros");
        System.out.println("2 - Converter centímetros para metros");
        System.out.println("3 - Sair");
        leerOpcion();
        System.out.println("=====================================================");
    }
    public void leerOpcion() {
        System.out.println("Elige una opción:");
        opcion = entrada.nextInt();
        while(true){
            validarOpcion();
        }
    }
    public void validarOpcion() {
        switch (opcion) {
            case 1:
                convertirMetrosACentimetros();
                System.exit(0);
                break;
            case 2:
                convertirCentimetrosAMetros();
                System.exit(0);
                break;
            case 3:
                System.out.println("Gracias por usar el conversor de longitudes");
                System.exit(0);
                break;
            default:
                limpiarConsola();
                mostrarMenu();
                break;
        }
    }
    private static void limpiarConsola() {
        System.out.println("\n*OPCION NO VÁLIDA. Presiona ENTER para continuar...");
        entrada.nextLine();
        entrada.nextLine();
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void convertirMetrosACentimetros() {
        System.out.println("\nIngrese el valor en metros:");
        double metros = entrada.nextDouble();
        double centimetros = metros * 100;
        System.out.println("El valor en centimetros es: " + centimetros + " cm");
    }
    public static void convertirCentimetrosAMetros() {
        System.out.println("\nIngrese el valor en centimetros:");
        double centimetros = entrada.nextDouble();
        double metros = centimetros / 100;
        System.out.println("El valor en metros es: " + metros + " m");
    }
    /**
     * Método que convierte una longitud de una unidad a otra
     * @param var1 // unidad de origen
     * @param var2 // unidad de destino
     * @param valor // valor a convertir
     * @return
     */
    public static String convertir(String var1, String var2, Double valor){
        // Convertir a metros
        Double inMeters=0.0;
        switch (var1) {
            case "kilometros":
                inMeters = valor * 1000;
                break;
            case "metros":
                inMeters = valor;
                break;
            case "centimetros":
                inMeters = valor / 100;
                break;
            default:
                // Aquí puedes manejar cualquier otro valor inesperado si lo deseas
                break;
        }
        
        // Convertir a la unidad deseada
        Double result = 0.0;
        switch (var2) {
            case "kilometros":
                result = inMeters / 1000;
                break;
            case "metros":
                result = inMeters;
                break;
            case "centimetros":
                result = inMeters * 100;
                break;
            default:
                // Aquí puedes manejar cualquier otro valor inesperado si lo deseas
                break;
        }

        // redondear a 2 decimales
        result = Math.round(result * 100.0) / 100.0;

        return result.toString();
    }

    //---------- Getters and Setters ----------
    public static Integer getOpcion() {
        return opcion;
    }
    
    public static String[] getOpciones(){
        return new String[] { "Seleccione una opcion", "kilometros", "metros", "centimetros"};
    }
    
    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
        this.centimetros = metros * 100;
    }

    public double getCentimetros() {
        return centimetros;
    }

    public void setCentimetros(double centimetros) {
        this.centimetros = centimetros;
        this.metros = centimetros / 100;
    }

}
