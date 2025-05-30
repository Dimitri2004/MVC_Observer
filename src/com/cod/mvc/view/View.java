package com.cod.mvc.view;

public class View {
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println("[View] " + matricula + ": " + v + "km/hr");
        return true;
    }
    public static boolean muestraGasolina(String matricula,Integer d){
        System.out.println("[View]"+matricula+": " +d +" l");
        return true;
    }
}
