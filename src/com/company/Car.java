package com.company;

public class Car extends Device {

    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            throw new Exception("sorry, kupujący nie ma kasy");
        }
        if(!seller.hasACar(this)){
            throw new Exception("Sorry, sprzedający nie ma auta");
        }
        if(!buyer.hasFreeParkingLot()){
            throw new Exception("kupujący nie ma gdzie trzymać auta")
        }

        buyer.removeCar(this);
        seller.addCar(this);
        buyer.cash -= price;
        seller.cash += price;

        System.out.println("Transakcja zakończona pomyślnie");
    }

}
