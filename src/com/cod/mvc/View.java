package com.cod.mvc;

public class View {

    /**
     * Muestra la velocidad
     * @param matricula
     * @param v
     * @return
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println("[View] " + matricula + ": " + v + "km/hr");
        return true;
    }
    public static boolean muestraDeposito(String matricula, Integer g){
        System.out.println("[View] " + matricula + ": " + g + " l");
        return true;
    }

    /**
     * Muestra una alarma de infracción
     * @param matricula
     * @param v
     *
     */
    public static boolean alarmaInfraccion(String matricula, Integer v) {
        System.out.println("[View] INFRACCION: " + matricula + " velocidad " + v + "km/hr");
        return true;
    }
    public static boolean alarmaInfraccionG(String matricula, Integer g) {
       if (Model.getCoche(matricula).deposito<g){
           System.out.println("Alerta: Postar");
           return false;
       }
       return true;

    }

}
