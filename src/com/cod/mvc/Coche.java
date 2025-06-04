package com.cod.mvc;

public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;
    public  Integer deposito;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.deposito=0;
    }
}
