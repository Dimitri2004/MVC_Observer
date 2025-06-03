package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

public class ObserverDeposito implements Observer {
    //Establecemos limite en 200
    final static int DEPOSITO=200;
    private final Model nuestroModel;

    /**
     * Constructor de la clase ObserverDeposito
     * @param nuestroModel el modelo que se va a observar
     */
    public ObserverDeposito(Model nuestroModel) {
        this.nuestroModel = nuestroModel;
    }

    @Override
    /*
        * Este método se ejecutará cuando el modelo notifique a los observadores
        *         En este caso, se comprueba si el depósito de gasolina del coche es menor que el límite establecido
        *        Si es así, se recomienda repostar y se actualiza la gasolina del coche
        *        @param coche el coche que ha cambiado su estado
        *       Se asume que el modelo ya ha notificado a este observador
        *       Se recomienda que el modelo llame a este método cuando se produzca un cambio en el estado del coche
        *
     */
    public void update(Coche coche){
        if (coche.gasolina<DEPOSITO){
            System.out.println("[ObserverDEPOSITO] Deposito bajo, se recomienda repostar");
            nuestroModel.cambiarGasolina(coche.matricula, coche.gasolina+20);
        }
    }
}
