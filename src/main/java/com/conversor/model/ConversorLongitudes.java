package com.conversor.model;

import java.util.Scanner;

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
    public static String convertir(Integer opcion, Double valor){
        switch (opcion) {
            case 1:
                return ""+valor*100+" cm";
            case 2:
                return ""+valor/100+" m";
            case 3:
                break;
            default:
                // Aquí puedes manejar cualquier otro valor inesperado si lo deseas
                break;
        }
        return null;
    }

    //---------- Getters and Setters ----------
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

    public static Integer getOpcion() {
        return opcion;
    }
    
    public static String[] getOpciones(){
        return new String[] { "Seleccione una opcion", "Converter metros para centímetros", "Converter centímetros para metros"};
    }
}
