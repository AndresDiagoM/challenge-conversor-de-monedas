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
    public static String convertir(String var1, String var2, Double value1){
        double USD_TO_COP = 3700.0;
        double USD_TO_EUR = 0.85;
        double USD_TO_JPY = 110.0;
        double USD_TO_GBP = 0.75;
        double USD_TO_KRW = 1100.0;

        // Convertir a USD
        double inUSD = 0.0;
        switch (var1) {
            case "COP":
                inUSD = value1 / USD_TO_COP;
                break;
            case "EUR":
                inUSD = value1 / USD_TO_EUR;
                break;
            case "JPY":
                inUSD = value1 / USD_TO_JPY;
                break;
            case "GBP":
                inUSD = value1 / USD_TO_GBP;
                break;
            case "KRW":
                inUSD = value1 / USD_TO_KRW;
                break;
            case "USD":
                inUSD = value1;
                break;
        }

        // Convertir a la moneda deseada
        double result = 0.0;
        switch (var2) {
            case "COP":
                result = inUSD * USD_TO_COP;
                break;
            case "EUR":
                result = inUSD * USD_TO_EUR;
                break;
            case "JPY":
                result = inUSD * USD_TO_JPY;
                break;
            case "GBP":
                result = inUSD * USD_TO_GBP;
                break;
            case "KRW":
                result = inUSD * USD_TO_KRW;
                break;
            case "USD":
                result = inUSD;
                break;
        }
        
        // redondear a 2 decimales
        result = Math.round(result * 100.0) / 100.0;
        
        return String.valueOf(result);
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
