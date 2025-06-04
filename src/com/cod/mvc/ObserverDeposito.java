package com.cod.mvc;

public class ObserverDeposito {
    final static int minimo=10;


    public static void update(Coche coche){
        // verificamos veloidad máxima
        if (coche.deposito < minimo) {
            View.alarmaInfraccionG(coche.matricula, coche.deposito);
        }
    }
}
