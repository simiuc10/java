package com.acug;
public class puertascoche {
    public static void main(String[] args){
        suma(20, 40, 60);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numerodepuertas);
    }

    public static void suma(int a, int b, int c){
        int resultado = a + b + c;
        System.out.println(resultado);
    }

}
