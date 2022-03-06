package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Car fiat = new Car();
        fiat.value = 10000.0;
        Car alfa = new Car();
        alfa.value = 30000.0;
        Car pasat = new Car();
        pasat.value = 100000.0;

        Human me = new Human ("Kacper", 3);
        me.setCar(fiat, 0);
        me.setCar(alfa, 1);
        me.setCar(pasat,2);

        System.out.println("Suma wartości aut wynosi:");
        System.out.println(me.getValueOfGarage());
    }
}
