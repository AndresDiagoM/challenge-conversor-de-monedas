/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.model;

/**
 *
 * @author felip
 */
public class ConversorMonedas {

    //---------- Atributos ----------
    private Double COP; // Peso Colombiano
    private Double USD; // Dólar
    private Double EUR; // Euro -> EUR
    private Double JPY; // Yen Japonés -> JPY
    private Double GBP; // Libra Esterlina -> GBP
    private Double KRW; // Won Coreano -> KRW
    private static Integer opcion; // Opción del menú


    //---------- Constructores ----------
    public ConversorMonedas(Double dollar) {
        this.COP = dollar * 3961.51;
        this.USD = dollar;
        this.EUR = dollar * 0.85;
        this.JPY = dollar * 110.08;
        this.GBP = dollar * 0.72;
        this.KRW = dollar * 1176.30;
    }
    public ConversorMonedas() {
        this(Double.valueOf(0));
    }

    //---------- Métodos ----------
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

    //---------- Getters & Setters ----------
    public static Integer getOpcion() {
        return opcion;
    }
    public static String[] getOpciones(){
        return new String[] { "Seleccione una opcion", "COP", "USD", "EUR", "JPY", "GBP", "KRW"};
    }

    public Double getCOP() {
        return COP;
    }
    public void setCOP(Double pesoColombiano) {
        this.COP = pesoColombiano;
    }

    public Double getUSD() {
        return USD;
    }
    public void setUSD(Double dollar) {
        this.USD = dollar;
    }

    public Double getEUR() {
        return EUR;
    }
    public void setEUR(Double euro) {
        this.EUR = euro;
    }

    public Double getJPY() {
        return JPY;
    }
    public void setJPY(Double yenJapones) {
        this.JPY = yenJapones;
    }

    public Double getGBP() {
        return GBP;
    }
    public void setGBP(Double libraEsterlina) {
        this.GBP = libraEsterlina;
    }

    public Double getKRW() {
        return KRW;
    }
    public void setKRW(Double WonCoreao) {
        this.KRW = WonCoreao;
    }

}
