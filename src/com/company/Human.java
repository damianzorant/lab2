package com.company;

public class Human {

    private static final int DEFAULT_GARAGE_SIZE = 2;

    String firstName;
    Car[] garage;
    Double cash;

    public Human(String firstName) {
        this.firstName = firstName;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName, Integer garageSize) {
        this.firstName = firstName;
        this.garage = new Car[garageSize];
    }

    public void setCar(Car newCar, Integer parkingLotNumber) {
        this.garage[parkingLotNumber] = newCar;
    }

    public Car getCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }

    public Double getValueOfGarage() {
        Double sumValue = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            sumValue += this.garage[i].value;
        }
        return sumValue;
    }

    public boolean hasACar(Car carWeLookingFor){
        for (Car car : this.garage){
            if(car == carWeLookingFor){
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeParkingLot(){
        for(int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null){
                return true;
            }
        }
        return false;
    }

    public void addCar(Car newCar){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                garage[i] = newCar;
                break;
            }
        }
        //todo: wywal błąd jeżeli nie znaleziono miejsca
    }

    public void removeCar(Car oldCar){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == oldCar){
                garage[i] = null;
                break;
            }
        }
        //todo: błąd jeżeli nie znaleziono auta
    }


}
