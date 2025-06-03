package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

public class Controller{

    // definimos la instancia del modelo
    private final Model miModel;

    /**
     * Constructor. Inicializamos el controller
     * Creamos los observadores que necesitamos
     * @param miModel
     */
    public Controller(Model miModel){
        this.miModel = miModel;

        // instanciamos al observador de la velocidad
        ObserverVelocidad observoVelocidad = new ObserverVelocidad(miModel);
        miModel.addObserver(observoVelocidad);

        // instanciamos un segundo observador para el limite de velocidad
        ObserverLimite observoLimite = new ObserverLimite(miModel);
        miModel.addObserver(observoLimite);

        // instanciamos los observadores que queremos
        // Este observador se encargará de avisar cuando se cambie la gasolina del coche
        ObserverLitros observerLitros= new ObserverLitros(miModel);
        miModel.addObserver(observerLitros);

        // instanciamos el observador de deposito
        // Este observador se encargará de avisar cuando el depósito de gasolina esté bajo
        ObserverDeposito observerDeposito= new ObserverDeposito(miModel);
        miModel.addObserver(observerDeposito);

    }

    /**
     * Crea un coche
     * @param nombre del coche
     * @param matricula del coche
     */
    public void crearCoche(String nombre, String matricula){
        miModel.crearCoche(nombre, matricula);
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula del coche
     * @param velocidad nueva
     */
    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModel.cambiarVelocidad(matricula, velocidad);
    }

    /**
     * Cambia el limite de gasolina de un coche
     * @param matricula del coche
     * @param gasolina nuevo
     */
    public void cambiarGasolina(String matricula,Integer gasolina){
        miModel.cambiarGasolina(matricula,gasolina);
    }






}