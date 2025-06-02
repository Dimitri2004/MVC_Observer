package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

public class ObserverLitros implements Observer{
    private final Model nuestroModel;

    public ObserverLitros(Model nuestroModel) {
        this.nuestroModel = nuestroModel;
    }

    public void update(Coche g){
            System.out.println("[ObserverLitros] Se ha repostado el deposito: " + g.gasolina.toString() + " l");
            View.muestraGasolina(g.matricula, g.gasolina);
    }

}
