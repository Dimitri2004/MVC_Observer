package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

public class ObserverLitros implements Observer{
    private final Model nuestroModel;

    public ObserverLitros(Model nuestroModel) {
        this.nuestroModel = nuestroModel;
    }

    /**
     * Este método se ejecutará cuando el modelo notifique a los observadores
     * En este caso, se muestra la cantidad de gasolina repostada en litros
     * @param g el coche que ha cambiado su estado
     * Se asume que el modelo ya ha notificado a este observador
     * Se recomienda que el modelo llame a este método cuando se produzca un cambio en el estado del coche
     */
    public void update(Coche g){
            System.out.println("[ObserverLitros] Se ha repostado el deposito: " + g.gasolina.toString() + " l");
            View.muestraGasolina(g.matricula, g.gasolina);
    }

}
