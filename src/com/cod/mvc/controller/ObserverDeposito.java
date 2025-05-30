package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

public class ObserverDeposito implements Observer {
    final static int DEPOSITO=200;
    private final Model nuestroModel;

    public ObserverDeposito(Model nuestroModel) {
        this.nuestroModel = nuestroModel;
    }

    public void update(Coche coche){
        if (coche.gasolina<DEPOSITO){
            System.out.println("[ObserverDEPOSITO] Deposito bajo, se recomienda repostar");

            nuestroModel.cambiarGasolina(coche.matricula, coche.gasolina+20);
        }
    }
}
